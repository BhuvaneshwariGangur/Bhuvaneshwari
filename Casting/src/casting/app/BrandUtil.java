package casting.app;

public class BrandUtil extends Brand {
	
		public void run(Brand brand) {
			
			Brand brand2 = new Brand();
			brand2.getBrandName();
			
			if(brand instanceof LocalBrand)
			{
				Brand local=new LocalBrand();
				local.getBrandName();//Brand
				
				LocalBrand local1=(LocalBrand)local;
				local1.getLocalBrand();;//Local Brand
			
			}
			if(brand instanceof InternationalBrand)
			{
				Brand national=new InternationalBrand();
				national.getBrandName();//Brand
				
				InternationalBrand national2=(InternationalBrand)national;
				national2.getInternationalBrandName();
			}
			
			if(brand instanceof InternationalBrand)
			{
				Brand inter=new InternationalBrand();
				inter.getBrandName();//Brand
				
				InternationalBrand inter2=(InternationalBrand)inter;
				inter2.getInternationalBrandName();
			}
			
			if(brand instanceof DuplicateBrand)
			{
				Brand duplicate=new DuplicateBrand();
				duplicate.getBrandName();//Brand
				
				DuplicateBrand duplicate2=(DuplicateBrand)duplicate;
				duplicate2.getDuplicateBrandName();
			}
		}
}


