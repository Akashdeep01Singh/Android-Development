fun main(){
    rec()
}

var count =0
fun rec(){
    count++;
    if(count<=5){
        println("hello"+count);
        rec();
    }

}