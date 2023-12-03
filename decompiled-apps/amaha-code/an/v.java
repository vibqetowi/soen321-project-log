package an;

import android.os.Bundle;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: LibraryHomeFragment.kt */
/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.k implements ss.q<Integer, String, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<LibraryCollection> f812u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f813v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, List list) {
        super(3);
        this.f812u = list;
        this.f813v = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    @Override // ss.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(Integer num, String str, Boolean bool) {
        String str2;
        boolean z10;
        String str3;
        ArrayList<LibraryCollectionItem> itemList;
        boolean z11;
        LibraryActivity libraryActivity;
        boolean z12;
        HashMap<String, LibraryCollectionItemAccessModel> hashMap;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel;
        ArrayList<LibraryCollectionItem> itemList2;
        boolean z13;
        LibraryActivity libraryActivity2;
        boolean z14;
        HashMap<String, LibraryCollectionItemAccessModel> hashMap2;
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel2;
        int intValue = num.intValue();
        String name = str;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.i.g(name, "name");
        String str4 = gk.a.f16573a;
        if (booleanValue) {
            str2 = "lib_collect_card_expand";
        } else {
            str2 = "lib_collect_card_collapse";
        }
        Bundle a10 = r1.b0.a("collection_name", name);
        List<LibraryCollection> list = this.f812u;
        LibraryCollection libraryCollection = (LibraryCollection) is.u.j2(intValue, list);
        boolean z15 = false;
        t tVar = this.f813v;
        if (libraryCollection != null && (itemList2 = libraryCollection.getItemList()) != null) {
            if (!itemList2.isEmpty()) {
                for (LibraryCollectionItem libraryCollectionItem : itemList2) {
                    androidx.fragment.app.p requireActivity = tVar.requireActivity();
                    if (requireActivity instanceof LibraryActivity) {
                        libraryActivity2 = (LibraryActivity) requireActivity;
                    } else {
                        libraryActivity2 = null;
                    }
                    if (libraryActivity2 != null && (hashMap2 = libraryActivity2.f11294y) != null && (libraryCollectionItemAccessModel2 = hashMap2.get(libraryCollectionItem.getId())) != null && libraryCollectionItemAccessModel2.isCompleted()) {
                        z14 = true;
                        continue;
                    } else {
                        z14 = false;
                        continue;
                    }
                    if (z14) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            if (z13) {
                z10 = true;
                if (!z10) {
                    str3 = "atleast_one_activity_completed";
                } else {
                    LibraryCollection libraryCollection2 = (LibraryCollection) is.u.j2(intValue, list);
                    if (libraryCollection2 != null && (itemList = libraryCollection2.getItemList()) != null) {
                        if (!itemList.isEmpty()) {
                            for (LibraryCollectionItem libraryCollectionItem2 : itemList) {
                                androidx.fragment.app.p requireActivity2 = tVar.requireActivity();
                                if (requireActivity2 instanceof LibraryActivity) {
                                    libraryActivity = (LibraryActivity) requireActivity2;
                                } else {
                                    libraryActivity = null;
                                }
                                if (libraryActivity != null && (hashMap = libraryActivity.f11294y) != null && (libraryCollectionItemAccessModel = hashMap.get(libraryCollectionItem2.getId())) != null && libraryCollectionItemAccessModel.isAccessed()) {
                                    z12 = true;
                                    continue;
                                } else {
                                    z12 = false;
                                    continue;
                                }
                                if (z12) {
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            z15 = true;
                        }
                    }
                    if (z15) {
                        str3 = "atleast_one_activity_started";
                    } else {
                        str3 = "no_activity_started";
                    }
                }
                a10.putString("collection_status", str3);
                a10.putString("source_of_action", "lib_main_screen");
                a10.putInt("collection_position_in_list", intValue);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, str2);
                return hs.k.f19476a;
            }
        }
        z10 = false;
        if (!z10) {
        }
        a10.putString("collection_status", str3);
        a10.putString("source_of_action", "lib_main_screen");
        a10.putInt("collection_position_in_list", intValue);
        hs.k kVar2 = hs.k.f19476a;
        gk.a.b(a10, str2);
        return hs.k.f19476a;
    }
}
