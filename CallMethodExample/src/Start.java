public class Start {

    public static void main(String[] args) {


        Start start = new Start();

//        Вызов метода и передача возвращаемого значения как параметр (последовательный вызов по типу матрешки)
        start.printString(start.getNewValue(start.getString()));

//        Вызов метода и возврат результата в качестве return для другого метода (типы должны совпадать)
        start.printString(start.returnMethod());

//        Вызов метода, который в конце снова вызывает себя до тех пор, пока не выполнится определенное условие («рекурсия»)
        start.recursive(0);


    }

    private String getNewValue(String string) {
        return string+" and new value!";
    }

    public String getString() {
        return "new string";
    }

    public void printString(String value) {
        System.out.println("value = " + value);
    }

    public String returnMethod(){
        return getNewValue("new value");
    }

    public int recursive(int value){
        value += 1;
        if (value==10){
            return value;
        }
        System.out.println(value);

        return recursive(value);// рекурсия
    }

    public String returnExample(int count){

        if (count==0){
            return "error";
        }

        // тело метода


        if (count<0){
            return "negative";
        }else{
            return "unknown";
        }

    }

    public void returnExampleVoid(int count){

        if (count==0){
            return;// досрочный выход из метода
        }

        // тело метода


    }
}
