package an;

import android.os.Bundle;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
/* compiled from: LibraryAllCollectionsFragment.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.k implements ss.t<String, Integer, Boolean, String, Boolean, LibraryCollection, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f675u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(6);
        this.f675u = cVar;
    }

    @Override // ss.t
    public final Object e(String str, Integer num, Boolean bool, String str2, Boolean bool2, LibraryCollection libraryCollection) {
        LibraryActivity libraryActivity;
        String str3;
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        if (str != null) {
            c cVar = this.f675u;
            if (!booleanValue && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                androidx.fragment.app.p requireActivity = cVar.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                cVar.startActivity(tr.r.s(requireActivity, false).putExtra("source", str));
            } else {
                androidx.fragment.app.p requireActivity2 = cVar.requireActivity();
                if (requireActivity2 instanceof LibraryActivity) {
                    libraryActivity = (LibraryActivity) requireActivity2;
                } else {
                    libraryActivity = null;
                }
                if (libraryActivity != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("collection_id", str);
                    bundle.putInt("collection_pos", intValue);
                    bundle.putSerializable("collection", libraryCollection);
                    hs.k kVar = hs.k.f19476a;
                    libraryActivity.n0(bundle, "collection");
                }
            }
            String str4 = gk.a.f16573a;
            Bundle f = defpackage.e.f("collection_name", str2, "source_of_action", "collection_list_view");
            if (booleanValue2) {
                str3 = "expanded";
            } else {
                str3 = "collapsed";
            }
            f.putString("chevron_status", str3);
            f.putInt("position_in_list", intValue);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(f, "lib_collect_card_cta_click");
        }
        return hs.k.f19476a;
    }
}
