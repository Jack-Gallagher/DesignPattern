package behavioralPatterns.mediatorPattern2;

/**
 * @Author：Jack
 * @Date： 2021/9/9 - 21:58
 * @Description： behavioralPatterns.mediatorPattern2
 * @Version： 1.0
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) { //采购电脑
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) { //销售电脑
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) { //折价销售
            this.offSell();
        } else if (str.equals("stock.clear")) { //清仓处理
            this.clearStock();
        }

    }

    private void clearStock() {

        super.sale.offSale();
        super.purchse.refuseBuy();
    }

    private void offSell() {
        System.out.println("off sale "+stock.getStockNumber());
    }

    private void sellComputer(int number) {
        if(super.stock.getStockNumber()<number){
            super.purchse.buyComputers(number);
        }
        super.stock.decrease(number);
    }

    private void buyComputer(int number) {
        int status = super.sale.getStatus();
        if(status>80){  //销售情况良好
            System.out.println("采购IBM电脑:"+number + "台");
            super.stock.increase(number);
        }else{  //销售情况不好
            int buyNumber = number/2;  //折半采购
            System.out.println("采购IBM电脑："+buyNumber+ "台");
        }

    }
}
