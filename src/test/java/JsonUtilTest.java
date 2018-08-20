import org.junit.Test;
import pojo.Supplier;
import utils.JsonUtil;

/**
 * 测试JsonUtil工具类转换String和Object
 */
public class JsonUtilTest {
    @Test
    public void obj2StringTest(){
        Supplier supplier =new Supplier();
        supplier.setSupplierId("123");
        supplier.setSupplierName("Obj2Json");
        String json = JsonUtil.obj2JsonString(supplier);
        String prettyJson = JsonUtil.obj2JsonStringPretty(supplier);
        System.out.println(json);
        System.out.println(prettyJson);
    }

    @Test
    public void string2ObjTest(){
        String json = "{\"supplierId\":\"123\",\"supplierName\":\"String2Obj\" }";
        Supplier supplier = JsonUtil.jsonString2Obj(json,Supplier.class);
        System.out.println(supplier);
    }

}
