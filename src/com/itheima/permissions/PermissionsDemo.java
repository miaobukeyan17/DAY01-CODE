package com.itheima.permissions;

public class PermissionsDemo {
    /*
            权限修饰符 :
                        private:同一个类中
                        (default):默认权限修饰符
                                同一类中,同一包中
                        protected: 同一个类中,同一个包中,不同包的子类
                        public:任意位置访问
     */
    public static void main(String[] args) {
        Student STU = new Student();
        STU.age = 18;
        STU.show();
    }
}
