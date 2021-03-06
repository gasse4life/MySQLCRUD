package info.depanneur_virtuel.mysqlcrud;

/**
 * Created by Belal on 10/24/2015.
 */
public class Config {
     //Employee  CRUD
    public static final String URL_ADD="http://depanneur-virtuel.info/apk/addEmp.php";
    public static final String URL_GET_EMP = "http://depanneur-virtuel.info/apk/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://depanneur-virtuel.info/apk/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://depanneur-virtuel.info/apk/deleteEmp.php?id=";

    public static final String URL_GET_ALL = "http://depanneur-virtuel.info/apk/getAllEmp.php";
    public static final String URL_GET_ALL_CAT = "http://depanneur-virtuel.info/apk_getAllcat.php";


    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_NAME = "name";
    public static final String TAG_LASTNAME = "lastname";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    public static final String EMP_ID = "emp_id";
    public static final String TAG_ID = "id";
    public static final String CAT_ID = "id";
}