package test;

import org.junit.Test;

public class yuexingTest {
	/**
	 * 
	 * 有一个长阶梯，每一步上2阶，最后剩1阶；若每一步上3阶；最后剩2阶；若每一步上5阶；最后剩4阶；
	 * 若每一步上6阶；最后剩5阶；只有每步上7阶，最后一阶也不剩。
	 * 请问该阶梯至少有多少阶？ 编写一个Java程序解决该问题
	 * 
	 */
	@Test
	public void test(){
		for (int i = 7;; i += 7) {
            if(i % 2 == 1 && i % 3 == 2 && i % 5 == 4 && i % 6 == 5) {
                System.out.println(i);
                 break;
            }
            System.out.println(i);
        }
	}
	@Test
	public void test1(){
		int x= 0;
		System.out.println((x&1)==0);
	}
}
