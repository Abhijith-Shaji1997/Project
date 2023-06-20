package executePageClasses;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderLogin {
 
  

  @DataProvider(name="DataProvider1")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "carol","1q2w34w" },
      new Object[] { "carolll", "1q2w3e4r" },
      new Object[] { "carole", "12w13e" }
      
    };
  
  
}
  
  @DataProvider(name="DataProvider1")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "carol","1q2w34w" }
};
    
  }
  
}