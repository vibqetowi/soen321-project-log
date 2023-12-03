package c4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.r5;
import java.util.concurrent.Callable;
import ta.r3;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4963u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f4964v;

    public /* synthetic */ w(int i6, Object obj) {
        this.f4963u = i6;
        this.f4964v = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Bundle bundle;
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        switch (this.f4963u) {
            case 0:
                x xVar = (x) this.f4964v;
                synchronized (xVar.f4965u) {
                    if (!xVar.f4966v) {
                        if (!TextUtils.isEmpty(null)) {
                            bundle = r1.b0.a("accountName", null);
                        } else {
                            bundle = null;
                        }
                        int i10 = 3;
                        try {
                            String packageName = xVar.f4968x.f.getPackageName();
                            int i11 = 17;
                            i6 = 3;
                            while (true) {
                                if (i11 >= 3) {
                                    if (bundle == null) {
                                        try {
                                            i6 = xVar.f4968x.f4884g.L(i11, packageName, "subs");
                                        } catch (Exception e10) {
                                            e = e10;
                                            i10 = i6;
                                            oa.i.g("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            xVar.f4968x.f4880b = 0;
                                            xVar.f4968x.f4884g = null;
                                            i6 = i10;
                                            if (i6 != 0) {
                                            }
                                            return null;
                                        }
                                    } else {
                                        i6 = xVar.f4968x.f4884g.t1(i11, packageName, "subs", bundle);
                                    }
                                    if (i6 != 0) {
                                        i11--;
                                    }
                                } else {
                                    i11 = 0;
                                }
                            }
                            xVar.f4968x.getClass();
                            a aVar = xVar.f4968x;
                            boolean z16 = true;
                            if (i11 >= 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            aVar.f4886i = z10;
                            if (i11 < 3) {
                                oa.i.e("BillingClient", "In-app billing API does not support subscription on this device.");
                            }
                            int i12 = 17;
                            while (true) {
                                if (i12 >= 3) {
                                    if (bundle == null) {
                                        i6 = xVar.f4968x.f4884g.L(i12, packageName, "inapp");
                                    } else {
                                        i6 = xVar.f4968x.f4884g.t1(i12, packageName, "inapp", bundle);
                                    }
                                    if (i6 == 0) {
                                        xVar.f4968x.f4887j = i12;
                                    } else {
                                        i12--;
                                    }
                                }
                            }
                            a aVar2 = xVar.f4968x;
                            int i13 = aVar2.f4887j;
                            if (i13 >= 17) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            aVar2.f4893p = z11;
                            if (i13 >= 16) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            aVar2.f4892o = z12;
                            if (i13 >= 15) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar2.f4891n = z13;
                            if (i13 >= 14) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            aVar2.f4890m = z14;
                            if (i13 >= 9) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            aVar2.f4889l = z15;
                            if (i13 < 6) {
                                z16 = false;
                            }
                            aVar2.f4888k = z16;
                            if (i13 < 3) {
                                oa.i.f("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            }
                            if (i6 == 0) {
                                xVar.f4968x.f4880b = 2;
                            } else {
                                xVar.f4968x.f4880b = 0;
                                xVar.f4968x.f4884g = null;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        if (i6 != 0) {
                            xVar.a(z.f4976g);
                        } else {
                            xVar.a(z.f4971a);
                        }
                    }
                }
                return null;
            case 1:
                return ((Context) this.f4964v).getSharedPreferences("google_sdk_flags", 0);
            default:
                return new r5(((r3) this.f4964v).E);
        }
    }
}
