package builder.origin;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部件组成。  
 * @author angelwhu
 *
 */
public class Product {
	
	List<String> parts = new ArrayList<>();
	
	public void add(String part)
	{
		parts.add(part);
	}
	
	public void show()
	{
		System.out.println("\n产品  创建 ---");
		for(String part : parts)
		{
			System.out.println(part);
		}
	}
	
}
