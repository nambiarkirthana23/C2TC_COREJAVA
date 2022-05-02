package com.tnsif.Application;
import com.tnsif.Framework.PrimeAcc;
public class GSPrimeAcc extends PrimeAcc {
	public GSPrimeAcc(int accNo, String accNm, float b, boolean isPrime) {
		super(accNo, accNm, b, isPrime);
		// TODO Auto-generated constructor stub
	}


	private static final float charges=0;
	

	public void bookProduct(float charges) {
		System.out.println("Dear Prime User Your Product charges are::"+charges);
	}


	@Override
	public String toString() {
		return "GsPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
