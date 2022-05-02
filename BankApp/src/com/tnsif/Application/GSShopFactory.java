package com.tnsif.Application;
import com.tnsif.Framework.NormalAcc;
import com.tnsif.Framework.PrimeAcc;
import com.tnsif.Framework.ShopFactory;
public class GSShopFactory implements ShopFactory {
	public GSPrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean b) {
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo, accNm, charges, false);
		return gsprime;
		 
	 }
	 public GSNormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float dileveryCharges) {
		 GSNormalAcc gsnormal=new GSNormalAcc(accNo, accNm,charges, dileveryCharges);
		 return gsnormal;
		 
	 }
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, float isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
}
