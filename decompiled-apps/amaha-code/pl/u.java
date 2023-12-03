package pl;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14CScreenFragment;
import java.util.ArrayList;
import java.util.Iterator;
import ql.t;
/* compiled from: N14CScreenFragment.kt */
/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.k implements ss.l<ArrayList<hs.f<? extends String, ? extends t.a>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14CScreenFragment f28641u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f28642v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f28643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(N14CScreenFragment n14CScreenFragment, String str, String str2) {
        super(1);
        this.f28641u = n14CScreenFragment;
        this.f28642v = str;
        this.f28643w = str2;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<hs.f<? extends String, ? extends t.a>> arrayList) {
        String str;
        String str2;
        Object obj;
        t.a aVar;
        Object obj2;
        t.a aVar2;
        Object obj3;
        t.a aVar3;
        ArrayList<hs.f<? extends String, ? extends t.a>> list = arrayList;
        kotlin.jvm.internal.i.f(list, "list");
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = null;
            str2 = this.f28642v;
            if (hasNext) {
                obj = it.next();
                if (kotlin.jvm.internal.i.b(((hs.f) obj).f19464u, str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hs.f fVar = (hs.f) obj;
        if (fVar != null) {
            aVar = (t.a) fVar.f19465v;
        } else {
            aVar = null;
        }
        t.a aVar4 = t.a.COMPLETED;
        N14CScreenFragment n14CScreenFragment = this.f28641u;
        if (aVar == aVar4) {
            String str3 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            n14CScreenFragment.U(bundle);
            gk.a.b(bundle, "activity_video_auto_download_yes");
            n14CScreenFragment.C = true;
            n14CScreenFragment.X(str2);
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (kotlin.jvm.internal.i.b(((hs.f) obj2).f19464u, str2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            hs.f fVar2 = (hs.f) obj2;
            if (fVar2 != null) {
                aVar2 = (t.a) fVar2.f19465v;
            } else {
                aVar2 = null;
            }
            t.a aVar5 = t.a.FAILED;
            if (aVar2 == aVar5 && n14CScreenFragment.L < 3) {
                String str4 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                n14CScreenFragment.U(bundle2);
                gk.a.b(bundle2, "activity_video_auto_download_fail");
                n14CScreenFragment.P(this.f28643w, str2);
            } else {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (kotlin.jvm.internal.i.b(((hs.f) obj3).f19464u, str2)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                hs.f fVar3 = (hs.f) obj3;
                if (fVar3 != null) {
                    aVar3 = (t.a) fVar3.f19465v;
                } else {
                    aVar3 = null;
                }
                if (aVar3 == aVar5 && n14CScreenFragment.L >= 3 && !n14CScreenFragment.D) {
                    n14CScreenFragment.C = false;
                    n14CScreenFragment.D = true;
                    Context requireContext = n14CScreenFragment.requireContext();
                    N14CScreenFragment.a aVar6 = n14CScreenFragment.B;
                    if (aVar6 != null) {
                        str = aVar6.f10988l;
                    }
                    Toast.makeText(requireContext, str, 0).show();
                }
            }
        }
        return hs.k.f19476a;
    }
}
