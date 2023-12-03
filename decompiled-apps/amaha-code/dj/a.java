package dj;

import gi.c;
/* compiled from: BooleanOperation.java */
/* loaded from: classes.dex */
public class a extends com.android.volley.toolbox.a {
    public static boolean J(c cVar, c cVar2, c cVar3) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (cVar.compareTo(cVar2) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (cVar.compareTo(cVar2) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (cVar.compareTo(cVar3) < 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return true;
            }
        }
        return false;
    }
}
