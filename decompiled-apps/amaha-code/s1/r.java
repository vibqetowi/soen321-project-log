package s1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import s1.u;
import s1.w;
/* compiled from: NavDeepLinkBuilder.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Context f31217a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f31218b;

    /* renamed from: c  reason: collision with root package name */
    public final w f31219c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f31220d;

    /* compiled from: NavDeepLinkBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f31221a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f31222b;

        public a(int i6, Bundle bundle) {
            this.f31221a = i6;
            this.f31222b = bundle;
        }
    }

    public r(i navController) {
        Intent launchIntentForPackage;
        kotlin.jvm.internal.i.g(navController, "navController");
        Context context = navController.f31136a;
        kotlin.jvm.internal.i.g(context, "context");
        this.f31217a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f31218b = launchIntentForPackage;
        this.f31220d = new ArrayList();
        this.f31219c = navController.h();
    }

    public final f0.f0 a() {
        w wVar = this.f31219c;
        if (wVar != null) {
            ArrayList arrayList = this.f31220d;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                u uVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    int i6 = 0;
                    Context context = this.f31217a;
                    if (hasNext) {
                        a aVar = (a) it.next();
                        int i10 = aVar.f31221a;
                        u b10 = b(i10);
                        if (b10 != null) {
                            int[] o10 = b10.o(uVar);
                            int length = o10.length;
                            while (i6 < length) {
                                arrayList2.add(Integer.valueOf(o10[i6]));
                                arrayList3.add(aVar.f31222b);
                                i6++;
                            }
                            uVar = b10;
                        } else {
                            int i11 = u.D;
                            String a10 = u.a.a(i10, context);
                            throw new IllegalArgumentException("Navigation destination " + a10 + " cannot be found in the navigation graph " + wVar);
                        }
                    } else {
                        int[] H2 = is.u.H2(arrayList2);
                        Intent intent = this.f31218b;
                        intent.putExtra("android-support-nav:controller:deepLinkIds", H2);
                        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                        f0.f0 f0Var = new f0.f0(context);
                        f0Var.e(new Intent(intent));
                        ArrayList<Intent> arrayList4 = f0Var.f14622u;
                        int size = arrayList4.size();
                        while (i6 < size) {
                            Intent intent2 = arrayList4.get(i6);
                            if (intent2 != null) {
                                intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                            }
                            i6++;
                        }
                        return f0Var;
                    }
                }
            } else {
                throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
            }
        } else {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
    }

    public final u b(int i6) {
        is.g gVar = new is.g();
        w wVar = this.f31219c;
        kotlin.jvm.internal.i.d(wVar);
        gVar.addLast(wVar);
        while (!gVar.isEmpty()) {
            u uVar = (u) gVar.removeFirst();
            if (uVar.B == i6) {
                return uVar;
            }
            if (uVar instanceof w) {
                w.a aVar = new w.a();
                while (aVar.hasNext()) {
                    gVar.addLast((u) aVar.next());
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.f31220d.iterator();
        while (it.hasNext()) {
            int i6 = ((a) it.next()).f31221a;
            if (b(i6) == null) {
                int i10 = u.D;
                StringBuilder g5 = defpackage.d.g("Navigation destination ", u.a.a(i6, this.f31217a), " cannot be found in the navigation graph ");
                g5.append(this.f31219c);
                throw new IllegalArgumentException(g5.toString());
            }
        }
    }
}
