package xyz.tberghuis.irblaster;

import android.content.Context;
import android.util.Log;

public class IrCommand {


    public static void irCommand(Context context, String cmd) {
        Object irObject;
        irObject = context.getSystemService(Context.CONSUMER_IR_SERVICE);

        try {
            irObject.getClass().getMethod("write_irsend", new Class[]{String.class}).invoke(irObject, new Object[]{cmd});

        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), "Error sending IR command!", Toast.LENGTH_LONG).show();
            Log.e("xxx", "ir command failed");
        }
    }


    public java.lang.String calcIRCodefromLircDialog(android.app.Dialog r36, boolean r37) {
        /*
            r35 = this;
            r0 = r36
            r1 = 2131231050(0x7f08014a, float:1.807817E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r2 = 2131230981(0x7f080105, float:1.807803E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r3 = 2131231052(0x7f08014c, float:1.8078174E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r4 = 2131231051(0x7f08014b, float:1.8078172E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r5 = 2131231053(0x7f08014d, float:1.8078176E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r6 = 2131231065(0x7f080159, float:1.80782E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r7 = 2131231061(0x7f080155, float:1.8078192E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r8 = 2131231060(0x7f080154, float:1.807819E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.EditText r8 = (android.widget.EditText) r8
            r9 = 2131230733(0x7f08000d, float:1.8077527E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.EditText r9 = (android.widget.EditText) r9
            r10 = 2131230729(0x7f080009, float:1.807752E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r11 = 2131231067(0x7f08015b, float:1.8078205E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.EditText r11 = (android.widget.EditText) r11
            r12 = 2131231066(0x7f08015a, float:1.8078203E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.EditText r12 = (android.widget.EditText) r12
            r13 = 2131230731(0x7f08000b, float:1.8077523E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.EditText r13 = (android.widget.EditText) r13
            r14 = 2131231054(0x7f08014e, float:1.8078178E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.EditText r14 = (android.widget.EditText) r14
            r15 = 2131230727(0x7f080007, float:1.8077515E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.EditText r15 = (android.widget.EditText) r15
            r16 = r2
            r2 = 2131230726(0x7f080006, float:1.8077513E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r17 = r10
            r10 = 2131230730(0x7f08000a, float:1.8077521E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r18 = r9
            r9 = 2131230728(0x7f080008, float:1.8077517E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.EditText r9 = (android.widget.EditText) r9
            r19 = r11
            r11 = 2131230732(0x7f08000c, float:1.8077525E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.EditText r11 = (android.widget.EditText) r11
            r20 = r11
            r11 = 2131231278(0x7f08022e, float:1.8078633E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.Switch r11 = (android.widget.Switch) r11
            r21 = r12
            r12 = 2131230772(0x7f080034, float:1.8077606E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.Switch r12 = (android.widget.Switch) r12
            r22 = r9
            r9 = 2131231280(0x7f080230, float:1.8078637E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.Switch r9 = (android.widget.Switch) r9
            r23 = r10
            r10 = 2131230773(0x7f080035, float:1.8077608E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.Switch r10 = (android.widget.Switch) r10
            r24 = r10
            r10 = 2131230943(0x7f0800df, float:1.8077953E38)
            android.view.View r0 = r0.findViewById(r10)
            android.widget.Button r0 = (android.widget.Button) r0
            android.text.Editable r10 = r1.getText()
            java.lang.String r10 = r10.toString()
            r25 = r9
            java.lang.String r9 = ""
            boolean r10 = r10.equals(r9)
            r26 = r2
            r2 = 0
            if (r10 == 0) goto L_0x0105
            r0.setEnabled(r2)
            return r9
        L_0x0105:
            android.text.Editable r10 = r1.getText()
            java.lang.String r10 = r10.toString()
            int r10 = java.lang.Integer.parseInt(r10)
            r2 = 16000(0x3e80, float:2.2421E-41)
            if (r10 < r2) goto L_0x0681
            android.text.Editable r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
            r10 = 80000(0x13880, float:1.12104E-40)
            if (r2 <= r10) goto L_0x0128
            goto L_0x0681
        L_0x0128:
            android.text.Editable r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            boolean r10 = r11.isChecked()
            java.lang.String r11 = ","
            if (r10 == 0) goto L_0x01e6
            android.text.Editable r10 = r3.getText()
            java.lang.String r10 = r10.toString()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x01e6
            android.text.Editable r10 = r4.getText()
            java.lang.String r10 = r10.toString()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x01e6
            android.text.Editable r10 = r4.getText()
            java.lang.String r10 = r10.toString()
            int r10 = java.lang.Integer.parseInt(r10)
            if (r10 <= 0) goto L_0x01e6
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 <= 0) goto L_0x01e6
            int r3 = r3 * r1
            float r3 = (float) r3
            r10 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r10
            int r3 = java.lang.Math.round(r3)
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            int r4 = java.lang.Integer.parseInt(r4)
            int r4 = r4 * r1
            float r4 = (float) r4
            float r4 = r4 / r10
            int r4 = java.lang.Math.round(r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r11)
            r27 = r2
            java.lang.String r2 = java.lang.Integer.toString(r3)
            java.lang.StringBuilder r2 = r10.append(r2)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r10 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            int r10 = r3 + r4
            r28 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r2
            r2 = r10
            goto L_0x01ed
        L_0x01e6:
            r27 = r2
            r3 = r9
            r28 = r3
            r2 = 0
            r10 = 0
        L_0x01ed:
            android.text.Editable r4 = r5.getText()
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x067c
            android.text.Editable r4 = r6.getText()
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x067c
            android.text.Editable r4 = r7.getText()
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x067c
            android.text.Editable r4 = r8.getText()
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x0227
            goto L_0x067c
        L_0x0227:
            android.text.Editable r4 = r5.getText()
            java.lang.String r4 = r4.toString()
            long r4 = java.lang.Long.parseLong(r4)
            r29 = r2
            long r1 = (long) r1
            long r4 = r4 * r1
            double r4 = (double) r4
            r30 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r30
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            android.text.Editable r4 = r6.getText()
            java.lang.String r4 = r4.toString()
            long r32 = java.lang.Long.parseLong(r4)
            r6 = r3
            long r3 = r32 * r1
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r30
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            android.text.Editable r3 = r7.getText()
            java.lang.String r3 = r3.toString()
            long r32 = java.lang.Long.parseLong(r3)
            r3 = r6
            long r6 = r32 * r1
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r30
            long r6 = java.lang.Math.round(r6)
            int r7 = (int) r6
            android.text.Editable r6 = r8.getText()
            java.lang.String r6 = r6.toString()
            long r32 = java.lang.Long.parseLong(r6)
            r8 = r10
            r6 = r11
            long r10 = r32 * r1
            double r10 = (double) r10
            java.lang.Double.isNaN(r10)
            double r10 = r10 / r30
            long r10 = java.lang.Math.round(r10)
            int r11 = (int) r10
            if (r5 != 0) goto L_0x029a
            r5 = 1
        L_0x029a:
            if (r4 != 0) goto L_0x029d
            r4 = 1
        L_0x029d:
            if (r7 != 0) goto L_0x02a0
            r7 = 1
        L_0x02a0:
            if (r11 != 0) goto L_0x02a3
            r11 = 1
        L_0x02a3:
            java.math.BigInteger r32 = java.math.BigInteger.ZERO
            boolean r12 = r12.isChecked()
            r33 = 2
            r10 = 16
            if (r12 == 0) goto L_0x02fd
            android.text.Editable r12 = r13.getText()
            java.lang.String r12 = r12.toString()
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x02c2
            r12 = 0
            r0.setEnabled(r12)
            return r9
        L_0x02c2:
            android.text.Editable r12 = r13.getText()
            java.lang.String r12 = r12.toString()
            int r12 = java.lang.Integer.parseInt(r12)
            if (r12 <= 0) goto L_0x02f8
            java.math.BigInteger r13 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x02f3 }
            android.text.Editable r14 = r14.getText()     // Catch:{ NumberFormatException -> 0x02f3 }
            java.lang.String r14 = r14.toString()     // Catch:{ NumberFormatException -> 0x02f3 }
            r13.<init>(r14, r10)     // Catch:{ NumberFormatException -> 0x02f3 }
            java.math.BigInteger r14 = java.math.BigInteger.valueOf(r33)
            java.math.BigInteger r14 = r14.pow(r12)
            java.math.BigInteger r10 = java.math.BigInteger.ONE
            java.math.BigInteger r10 = r14.subtract(r10)
            java.math.BigInteger r32 = r13.and(r10)
            r13 = r32
            r10 = 0
            goto L_0x0301
        L_0x02f3:
            r10 = 0
            r0.setEnabled(r10)
            return r9
        L_0x02f8:
            r10 = 0
            r0.setEnabled(r10)
            return r9
        L_0x02fd:
            r10 = 0
            r13 = r32
            r12 = 0
        L_0x0301:
            android.text.Editable r14 = r15.getText()
            java.lang.String r14 = r14.toString()
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto L_0x0313
            r0.setEnabled(r10)
            return r9
        L_0x0313:
            android.text.Editable r14 = r15.getText()
            java.lang.String r14 = r14.toString()
            int r14 = java.lang.Integer.parseInt(r14)
            if (r14 > 0) goto L_0x0325
            r0.setEnabled(r10)
            return r9
        L_0x0325:
            java.math.BigInteger r10 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x0677 }
            android.text.Editable r15 = r26.getText()     // Catch:{ NumberFormatException -> 0x0677 }
            java.lang.String r15 = r15.toString()     // Catch:{ NumberFormatException -> 0x0677 }
            r26 = r3
            r3 = 16
            r10.<init>(r15, r3)     // Catch:{ NumberFormatException -> 0x0677 }
            int r12 = r12 + r14
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r33)
            java.math.BigInteger r3 = r3.pow(r14)
            java.math.BigInteger r15 = java.math.BigInteger.ONE
            java.math.BigInteger r3 = r3.subtract(r15)
            java.math.BigInteger r13 = r13.shiftLeft(r14)
            java.math.BigInteger r3 = r10.and(r3)
            java.math.BigInteger r3 = r13.add(r3)
            boolean r10 = r25.isChecked()
            if (r10 == 0) goto L_0x03ad
            android.text.Editable r10 = r23.getText()
            java.lang.String r10 = r10.toString()
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x036a
            r10 = 0
            r0.setEnabled(r10)
            return r9
        L_0x036a:
            android.text.Editable r10 = r23.getText()
            java.lang.String r10 = r10.toString()
            int r10 = java.lang.Integer.parseInt(r10)
            if (r10 <= 0) goto L_0x03a8
            java.math.BigInteger r13 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x03a3 }
            android.text.Editable r14 = r22.getText()     // Catch:{ NumberFormatException -> 0x03a3 }
            java.lang.String r14 = r14.toString()     // Catch:{ NumberFormatException -> 0x03a3 }
            r15 = 16
            r13.<init>(r14, r15)     // Catch:{ NumberFormatException -> 0x03a3 }
            int r12 = r12 + r10
            java.math.BigInteger r14 = java.math.BigInteger.valueOf(r33)
            java.math.BigInteger r14 = r14.pow(r10)
            java.math.BigInteger r15 = java.math.BigInteger.ONE
            java.math.BigInteger r14 = r14.subtract(r15)
            java.math.BigInteger r3 = r3.shiftLeft(r10)
            java.math.BigInteger r10 = r13.and(r14)
            java.math.BigInteger r3 = r3.add(r10)
            goto L_0x03ad
        L_0x03a3:
            r1 = 0
            r0.setEnabled(r1)
            return r9
        L_0x03a8:
            r1 = 0
            r0.setEnabled(r1)
            return r9
        L_0x03ad:
            if (r37 == 0) goto L_0x03ce
            android.text.Editable r10 = r21.getText()     // Catch:{ NumberFormatException -> 0x03cd }
            java.lang.String r10 = r10.toString()     // Catch:{ NumberFormatException -> 0x03cd }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x03cd }
            if (r10 == 0) goto L_0x03cd
            if (r10 <= r12) goto L_0x03c0
            goto L_0x03cd
        L_0x03c0:
            java.math.BigInteger r13 = java.math.BigInteger.ONE
            int r10 = r12 - r10
            java.math.BigInteger r10 = r13.shiftLeft(r10)
            java.math.BigInteger r3 = r3.xor(r10)
            goto L_0x03ce
        L_0x03cd:
            return r9
        L_0x03ce:
            java.math.BigInteger r10 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x0672 }
            android.text.Editable r13 = r19.getText()     // Catch:{ NumberFormatException -> 0x0672 }
            java.lang.String r13 = r13.toString()     // Catch:{ NumberFormatException -> 0x0672 }
            r14 = 16
            r10.<init>(r13, r14)     // Catch:{ NumberFormatException -> 0x0672 }
            java.math.BigInteger r10 = r3.xor(r10)     // Catch:{ NumberFormatException -> 0x0672 }
            r13 = r12
            r14 = r28
            r12 = r8
            r8 = r26
        L_0x03e7:
            if (r13 <= 0) goto L_0x04b4
            java.math.BigInteger r15 = java.math.BigInteger.ZERO
            r21 = r1
            int r1 = r13 + -1
            java.math.BigInteger r1 = r15.setBit(r1)
            java.math.BigInteger r2 = r3.and(r1)
            java.math.BigInteger r15 = java.math.BigInteger.ZERO
            int r2 = r2.compareTo(r15)
            if (r2 == 0) goto L_0x0427
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r14 = java.lang.Integer.toString(r5)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r14 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.String r2 = r2.toString()
            int r14 = r5 + r4
            goto L_0x044e
        L_0x0427:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r14 = java.lang.Integer.toString(r7)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r14 = java.lang.Integer.toString(r11)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.String r2 = r2.toString()
            int r14 = r7 + r11
        L_0x044e:
            int r12 = r12 + r14
            r14 = r2
            java.math.BigInteger r1 = r10.and(r1)
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L_0x0484
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = java.lang.Integer.toString(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r5 + r4
            goto L_0x04ab
        L_0x0484:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = java.lang.Integer.toString(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = java.lang.Integer.toString(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r7 + r11
        L_0x04ab:
            int r29 = r29 + r2
            r8 = r1
            int r13 = r13 + -1
            r1 = r21
            goto L_0x03e7
        L_0x04b4:
            r21 = r1
            boolean r1 = r24.isChecked()
            java.lang.String r2 = ",1"
            if (r1 == 0) goto L_0x052c
            android.text.Editable r1 = r20.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x04d1
            r1 = 0
            r0.setEnabled(r1)
            return r9
        L_0x04d1:
            android.text.Editable r1 = r20.getText()
            java.lang.String r1 = r1.toString()
            long r3 = java.lang.Long.parseLong(r1)
            long r3 = r3 * r21
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r30
            long r3 = java.lang.Math.round(r3)
            int r1 = (int) r3
            if (r1 != 0) goto L_0x04ed
            r1 = 1
        L_0x04ed:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = java.lang.Integer.toString(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r14 = r3.toString()
            int r3 = r1 + 1
            int r12 = r12 + r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r8 = r1.toString()
            int r29 = r29 + r3
        L_0x052c:
            android.text.Editable r1 = r18.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0547
            android.text.Editable r1 = r18.getText()
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            goto L_0x0548
        L_0x0547:
            r1 = 0
        L_0x0548:
            android.text.Editable r3 = r17.getText()
            java.lang.String r3 = r3.toString()
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0558
        L_0x0556:
            r4 = 1
            goto L_0x0574
        L_0x0558:
            android.text.Editable r3 = r17.getText()
            java.lang.String r3 = r3.toString()
            long r3 = java.lang.Long.parseLong(r3)
            long r3 = r3 * r21
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r30
            long r3 = java.lang.Math.round(r3)
            int r4 = (int) r3
            if (r4 != 0) goto L_0x0574
            goto L_0x0556
        L_0x0574:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = r27
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r3 = r3.toString()
            r5 = 1
        L_0x0588:
            r7 = 1
            int r10 = r1 + 1
            if (r5 >= r10) goto L_0x0653
            int r9 = r3.lastIndexOf(r6)
            int r9 = r9 + r7
            int r10 = r3.length()
            java.lang.String r9 = r3.substring(r9, r10)
            int r9 = java.lang.Integer.parseInt(r9)
            int r10 = r3.lastIndexOf(r6)
            r11 = 0
            java.lang.String r3 = r3.substring(r11, r10)
            int r10 = r5 % 2
            if (r10 != r7) goto L_0x05fd
            boolean r10 = r16.isChecked()
            if (r10 == 0) goto L_0x05d2
            int r9 = r12 - r9
            int r9 = r4 - r9
            if (r9 >= r7) goto L_0x05b8
            r9 = 1
        L_0x05b8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r7 = java.lang.Integer.toString(r9)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            goto L_0x05eb
        L_0x05d2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r7 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
        L_0x05eb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            goto L_0x064f
        L_0x05fd:
            boolean r7 = r16.isChecked()
            if (r7 == 0) goto L_0x0625
            int r7 = r29 - r9
            int r7 = r4 - r7
            r9 = 1
            if (r7 >= r9) goto L_0x060b
            r7 = 1
        L_0x060b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r3 = r9.append(r3)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r7 = java.lang.Integer.toString(r7)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            goto L_0x063e
        L_0x0625:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r7 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
        L_0x063e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r3 = r7.append(r3)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r3 = r3.toString()
        L_0x064f:
            int r5 = r5 + 1
            goto L_0x0588
        L_0x0653:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = r3.lastIndexOf(r6)
            r5 = 0
            java.lang.String r3 = r3.substring(r5, r4)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.setEnabled(r2)
            return r1
        L_0x0672:
            r5 = 0
            r0.setEnabled(r5)
            return r9
        L_0x0677:
            r5 = 0
            r0.setEnabled(r5)
            return r9
        L_0x067c:
            r5 = 0
            r0.setEnabled(r5)
            return r9
        L_0x0681:
            r5 = 0
            r0.setEnabled(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: de.harrygr.rcoid.RcGrafik.calcIRCodefromLircDialog(android.app.Dialog, boolean):java.lang.String");
    }


}
