package casting.boot;

import casting.app.Brand;
import casting.app.BrandUtil;
import casting.app.DuplicateBrand;
import casting.app.InternationalBrand;
import casting.app.LocalBrand;

public class BrandRunner {

	public static void main(String[] args) {
		
		
				System.out.println("Running Main");
				
				Brand brand=new Brand();
				
				LocalBrand brand2=new LocalBrand();
				
				InternationalBrand brand3=new InternationalBrand();
				
				DuplicateBrand brand4=new DuplicateBrand();
				
				InternationalBrand brand5=new InternationalBrand();
				
				BrandUtil brandUtil=new BrandUtil();
				System.out.println("Calling run method with Brand ref");
				brandUtil.run(brand);
				System.out.println("************************************");
				
				BrandUtil brandUtil2=new BrandUtil();
				System.out.println("Calling run method with Local Brand ref");
				brandUtil2.run(brand2);
				System.out.println("***********************************");
				
				BrandUtil brandUtil3=new BrandUtil();
				System.out.println("Calling run method with international Brand ref");
				brandUtil3.run(brand3);
				System.out.println("**************************************");
				
				BrandUtil brandUtil4=new BrandUtil();
				System.out.println("Calling run method with Duplicat Brand ref");
				brandUtil4.run(brand4);
				System.out.println("*******************************************");
				
				BrandUtil brandUtil5=new BrandUtil();
				System.out.println("Calling run method with INternational Brand ref");
				brandUtil5.run(brand5);
				System.out.println("******************************************");

			

		

	}

}
