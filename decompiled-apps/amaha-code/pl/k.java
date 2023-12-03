package pl;

import android.os.Bundle;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import java.util.ArrayList;
import java.util.Iterator;
import ql.t;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<ArrayList<hs.f<? extends String, ? extends t.a>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28609u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f28610v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(N14AScreenFragment n14AScreenFragment, String str) {
        super(1);
        this.f28609u = n14AScreenFragment;
        this.f28610v = str;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<hs.f<? extends String, ? extends t.a>> arrayList) {
        t.a aVar;
        String str;
        Object obj;
        t.a aVar2;
        Object obj2;
        ArrayList<hs.f<? extends String, ? extends t.a>> list = arrayList;
        kotlin.jvm.internal.i.f(list, "list");
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = null;
            str = this.f28610v;
            if (hasNext) {
                obj = it.next();
                if (kotlin.jvm.internal.i.b(((hs.f) obj).f19464u, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hs.f fVar = (hs.f) obj;
        if (fVar != null) {
            aVar2 = (t.a) fVar.f19465v;
        } else {
            aVar2 = null;
        }
        t.a aVar3 = t.a.COMPLETED;
        N14AScreenFragment n14AScreenFragment = this.f28609u;
        if (aVar2 == aVar3) {
            String str2 = gk.a.f16573a;
            Bundle bundle = new Bundle();
            n14AScreenFragment.c0(bundle);
            gk.a.b(bundle, "activity_video_auto_download_yes");
            n14AScreenFragment.j0(str);
        } else {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (kotlin.jvm.internal.i.b(((hs.f) obj2).f19464u, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            hs.f fVar2 = (hs.f) obj2;
            if (fVar2 != null) {
                aVar = (t.a) fVar2.f19465v;
            }
            if (aVar == t.a.FAILED) {
                String str3 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                n14AScreenFragment.c0(bundle2);
                gk.a.b(bundle2, "activity_video_auto_download_fail");
            }
        }
        return hs.k.f19476a;
    }
}
