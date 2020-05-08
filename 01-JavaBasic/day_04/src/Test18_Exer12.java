/**
 * @author Liu Awen
 * @create 2018-05-08 22:37
 */
//12、找出1-100之间所有的素数（质数）
class Test18_Exer12{
    public static void main(String[] args){
        //找出1-100之间所有的素数（质数）
        //1-100之间
        for(int i=1; i<=100; i++){
            //里面的代码会运行100遍
            //每一遍i的值是不同的，i=1,2,3,4,5...100
            //每一遍都要判断i是否是素数，如果是，就打印i
			/*
			如何判断i是否是素数
			（1）找出i的所有的约数，并累加它们的和
			例如：
				i=5，它的约数有1和5，约数和：6
				i=11，它的约数有1和11，约数和：12
				i=18，它的约数有1,2,3,6,9,18，约数和：39
			（2）如果某个i的约数和 == i+1，那么i就是素数
			*/
            //（1）找出i的所有的约数，并累加它们的和
            int iSum = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    //j是i的约数
                    iSum += j;
                }
            }
            //（2）如果某个i的约数和 == i+1，那么i就是素数
            if(iSum == i+1){
                System.out.println(i);
            }

        }
    }
}