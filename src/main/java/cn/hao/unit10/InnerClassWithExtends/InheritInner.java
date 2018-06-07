package cn.hao.unit10.InnerClassWithExtends;

/**
 * Created by Tianbohao on 2018/5/29.
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
