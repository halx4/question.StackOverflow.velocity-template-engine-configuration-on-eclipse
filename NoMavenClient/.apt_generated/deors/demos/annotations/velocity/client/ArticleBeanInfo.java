package deors.demos.annotations.velocity.client;
//V2
import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.ParameterDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class ArticleBeanInfo extends java.beans.SimpleBeanInfo {

    /**
     * Gets the bean class object.
     *
     * @return the bean class
     */
    public static Class<?> getBeanClass() {

        return deors.demos.annotations.velocity.client.Article.class;
    }

    /**
     * Gets the bean class name.
     *
     * @return the bean class name
     */
    public static String getBeanClassName() {

        return "deors.demos.annotations.velocity.client.Article";
    }

    /**
     * Returns the deors.demos.annotations.velocity.client.Article bean descriptor.
     *
     * @return the bean descriptor
     */
    public BeanDescriptor getBeanDescriptor() {

        BeanDescriptor descriptor = new BeanDescriptor(getBeanClass());

        descriptor.setName("Article");
        descriptor.setDisplayName("Article");
        descriptor.setShortDescription("This JavaBean represents an Article in the On-line Store application");
        descriptor.setExpert(false);
        descriptor.setHidden(false);
        descriptor.setPreferred(false);

        return descriptor;
    }

    /**
     * Returns the list of property descriptors for the deors.demos.annotations.velocity.client.Article bean.
     *
     * @return the list of property descriptors
     */
    public PropertyDescriptor[] getPropertyDescriptors() {

        return new PropertyDescriptor[] {
            getIdPropertyDescriptor()
            getDepartmentPropertyDescriptor()
            getStatusPropertyDescriptor()
        };
    }

    /**
     * Returns the list of method descriptors for the deors.demos.annotations.velocity.client.Article bean.
     *
     * @return the list of method descriptors
     */
    public MethodDescriptor[] getMethodDescriptors() {

        return new MethodDescriptor[] {
            getIsInactiveMethodDescriptor()
            getActivateMethodDescriptor()
            getInvalidateMethodDescriptor()
            getIsActiveMethodDescriptor()
            getIsInvalidMethodDescriptor()
            getDeactivateMethodDescriptor()
        };
    }

    /**
     * Returns the id property descriptor.
     *
     * @return the property descriptor
     */
    public PropertyDescriptor getIdPropertyDescriptor() {

        // create a property descriptor with usual names for getter and setter
        try {
            PropertyDescriptor descriptor = new PropertyDescriptor("id", getBeanClass());

            descriptor.setBound(true);
            descriptor.setName("id");
            descriptor.setDisplayName("id");
            descriptor.setShortDescription("The unique identifier for this Article in the catalog");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (IntrospectionException e) {
            return null;
        }
    }

    /**
     * Returns the department property descriptor.
     *
     * @return the property descriptor
     */
    public PropertyDescriptor getDepartmentPropertyDescriptor() {

        // create a property descriptor with usual names for getter and setter
        try {
            PropertyDescriptor descriptor = new PropertyDescriptor("department", getBeanClass());

            descriptor.setBound(true);
            descriptor.setName("department");
            descriptor.setDisplayName("department");
            descriptor.setShortDescription("The department number where this Article belongs to");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (IntrospectionException e) {
            return null;
        }
    }

    /**
     * Returns the status property descriptor.
     *
     * @return the property descriptor
     */
    public PropertyDescriptor getStatusPropertyDescriptor() {

        // create a property descriptor with usual names for getter and setter
        try {
            PropertyDescriptor descriptor = new PropertyDescriptor("status", getBeanClass());

            descriptor.setBound(true);
            descriptor.setName("status");
            descriptor.setDisplayName("status");
            descriptor.setShortDescription("Textual representation of this Article status");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (IntrospectionException e) {
            return null;
        }
    }

    /**
     * Returns the isInactive() method descriptor.
     *
     * @return the method descriptor
     */
    public MethodDescriptor getIsInactiveMethodDescriptor() {

        try {
            // finds the method using getMethod with parameter types
            Class<?>[] parameterTypes = {};
            Method method = getBeanClass().getMethod("isInactive", parameterTypes);

            // creates the method parameter descriptors

            ParameterDescriptor[] parameterDescriptors = {
            };

            MethodDescriptor descriptor = new MethodDescriptor(method, parameterDescriptors);

            descriptor.setName("isInactive()");
            descriptor.setDisplayName("isInactive()");
            descriptor.setShortDescription("");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }

    /**
     * Returns the activate() method descriptor.
     *
     * @return the method descriptor
     */
    public MethodDescriptor getActivateMethodDescriptor() {

        try {
            // finds the method using getMethod with parameter types
            Class<?>[] parameterTypes = {};
            Method method = getBeanClass().getMethod("activate", parameterTypes);

            // creates the method parameter descriptors

            ParameterDescriptor[] parameterDescriptors = {
            };

            MethodDescriptor descriptor = new MethodDescriptor(method, parameterDescriptors);

            descriptor.setName("activate()");
            descriptor.setDisplayName("activate()");
            descriptor.setShortDescription("");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }

    /**
     * Returns the invalidate() method descriptor.
     *
     * @return the method descriptor
     */
    public MethodDescriptor getInvalidateMethodDescriptor() {

        try {
            // finds the method using getMethod with parameter types
            Class<?>[] parameterTypes = {java.lang.String.class};
            Method method = getBeanClass().getMethod("invalidate", parameterTypes);

            // creates the method parameter descriptors
            ParameterDescriptor parameterDescriptor1 = new ParameterDescriptor();
            parameterDescriptor1.setName("cause");
            parameterDescriptor1.setDisplayName("cause");
            parameterDescriptor1.setShortDescription("The cause why the Article is invalidated");
            parameterDescriptor1.setExpert(false);
            parameterDescriptor1.setHidden(false);
            parameterDescriptor1.setPreferred(false);

            ParameterDescriptor[] parameterDescriptors = {
                parameterDescriptor1
            };

            MethodDescriptor descriptor = new MethodDescriptor(method, parameterDescriptors);

            descriptor.setName("invalidate(java.lang.String)");
            descriptor.setDisplayName("invalidate(java.lang.String)");
            descriptor.setShortDescription("Action to invalidate the Article, given the cause");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }

    /**
     * Returns the isActive() method descriptor.
     *
     * @return the method descriptor
     */
    public MethodDescriptor getIsActiveMethodDescriptor() {

        try {
            // finds the method using getMethod with parameter types
            Class<?>[] parameterTypes = {};
            Method method = getBeanClass().getMethod("isActive", parameterTypes);

            // creates the method parameter descriptors

            ParameterDescriptor[] parameterDescriptors = {
            };

            MethodDescriptor descriptor = new MethodDescriptor(method, parameterDescriptors);

            descriptor.setName("isActive()");
            descriptor.setDisplayName("isActive()");
            descriptor.setShortDescription("");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }

    /**
     * Returns the isInvalid() method descriptor.
     *
     * @return the method descriptor
     */
    public MethodDescriptor getIsInvalidMethodDescriptor() {

        try {
            // finds the method using getMethod with parameter types
            Class<?>[] parameterTypes = {};
            Method method = getBeanClass().getMethod("isInvalid", parameterTypes);

            // creates the method parameter descriptors

            ParameterDescriptor[] parameterDescriptors = {
            };

            MethodDescriptor descriptor = new MethodDescriptor(method, parameterDescriptors);

            descriptor.setName("isInvalid()");
            descriptor.setDisplayName("isInvalid()");
            descriptor.setShortDescription("");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }

    /**
     * Returns the deactivate() method descriptor.
     *
     * @return the method descriptor
     */
    public MethodDescriptor getDeactivateMethodDescriptor() {

        try {
            // finds the method using getMethod with parameter types
            Class<?>[] parameterTypes = {};
            Method method = getBeanClass().getMethod("deactivate", parameterTypes);

            // creates the method parameter descriptors

            ParameterDescriptor[] parameterDescriptors = {
            };

            MethodDescriptor descriptor = new MethodDescriptor(method, parameterDescriptors);

            descriptor.setName("deactivate()");
            descriptor.setDisplayName("deactivate()");
            descriptor.setShortDescription("");
            descriptor.setExpert(false);
            descriptor.setHidden(false);
            descriptor.setPreferred(false);

            return descriptor;

        } catch (NoSuchMethodException | SecurityException e) {
            return null;
        }
    }
}
