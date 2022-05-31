import java.lang.reflect.Field;

/**
 * Get number of fields class declares (the ones inherited should be excluded).
 */
class FieldGetter {

    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {

        try {
            Class someClazz = Class.forName(clazz.getName());
            Field[] declaredField = someClazz.getDeclaredFields();
            return declaredField.length;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

}