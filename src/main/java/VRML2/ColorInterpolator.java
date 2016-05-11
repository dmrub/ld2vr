package VRML2;

import VRML2.VALUES.*;

public class ColorInterpolator extends NamedNode {
   public ColorInterpolator( ) {
      super();
   }
   public ColorInterpolator(String val) {
      super(val);
   }
   public ColorInterpolator(boolean val) {
      super(val);
   }

   public final MFFloat add_key(SFFloat val) {
      return ((MFFloat)key_).add(val);
   };
   public final MFFloat add_key(double val0) {
      return ((MFFloat)key_).add(val0);
   };
   public final ColorInterpolator set_key(MFFloat val) {
      key_ = val;
      return this;
   };
   public final ColorInterpolator set_key(String alias) {
      key_ = new Alias(alias);
      return this;
   };
   public final MFColor add_keyValue(SFColor val) {
      return ((MFColor)keyValue_).add(val);
   };
   public final MFColor add_keyValue(double val0,double val1,double val2) {
      return ((MFColor)keyValue_).add(val0,val1,val2);
   };
   public final ColorInterpolator set_keyValue(MFColor val) {
      keyValue_ = val;
      return this;
   };
   public final ColorInterpolator set_keyValue(String alias) {
      keyValue_ = new Alias(alias);
      return this;
   };

   public String codeStringAux(int l) {
      StringBuffer sb = new StringBuffer("ColorInterpolator {\n");

      if (null != key_ &&
          ! key_.equals(keyDefault_)) {
         sb.append(i(l + 1) + "key " + key_.codeString(l + 1) + "\n");
      }
      if (null != keyValue_ &&
          ! keyValue_.equals(keyValueDefault_)) {
         sb.append(i(l + 1) + "keyValue " + keyValue_.codeString(l + 1) + "\n");
      }
      return sb.append(i(l) + "}").toString();
   }

   protected Value key_ = new MFFloat();
   protected static final MFFloat keyDefault_ = new VRML2.VALUES.MFFloat();
   protected Value keyValue_ = new MFColor();
   protected static final MFColor keyValueDefault_ = new VRML2.VALUES.MFColor();
}
