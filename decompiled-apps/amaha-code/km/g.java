package km;

import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptData;
import com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.k;
import is.u;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: InAppPromptsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$processSinglePopup$1", f = "InAppPromptsViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, R.styleable.AppCompatTheme_windowFixedWidthMajor, 129, 144}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f23428u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ PopupItemModel f23429v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d f23430w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ArrayList<hs.f<String, String>> f23431x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PopupItemModel popupItemModel, d dVar, ArrayList<hs.f<String, String>> arrayList, ls.d<? super g> dVar2) {
        super(2, dVar2);
        this.f23429v = popupItemModel;
        this.f23430w = dVar;
        this.f23431x = arrayList;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f23429v, this.f23430w, this.f23431x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        ArrayList<String> uuidList;
        String str3;
        String str4;
        ArrayList<String> uuidList2;
        String str5;
        String str6;
        ArrayList<String> uuidList3;
        ProviderDetailHolderModel providerDetailHolderModel;
        ProviderDetailHolderModel providerDetailHolderModel2;
        ProviderDetailHolderModel providerDetailHolderModel3;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f23428u;
        ArrayList<hs.f<String, String>> arrayList = this.f23431x;
        d dVar = this.f23430w;
        PopupItemModel popupItemModel = this.f23429v;
        String str7 = null;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            sp.b.d0(obj);
                            return k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sp.b.d0(obj);
                    providerDetailHolderModel3 = (ProviderDetailHolderModel) obj;
                    if (providerDetailHolderModel3 != null) {
                        if (!providerDetailHolderModel3.isAvailable()) {
                            providerDetailHolderModel3 = null;
                        }
                        if (providerDetailHolderModel3 != null) {
                            w<hs.f<String, ProviderDetailHolderModel>> wVar = dVar.D;
                            InAppPromptData providerData = ((PopupItemModel.ProfileViewDropOff) popupItemModel).getProviderData();
                            if (providerData != null) {
                                str7 = providerData.getStatus();
                            }
                            wVar.i(new hs.f<>(str7, providerDetailHolderModel3));
                        }
                    }
                    arrayList.set(3, new hs.f<>("providerProfileDropOff", Constants.SUBSCRIPTION_NONE));
                    MyApplication.V.a().N = false;
                } else {
                    sp.b.d0(obj);
                    providerDetailHolderModel2 = (ProviderDetailHolderModel) obj;
                    if (providerDetailHolderModel2 != null) {
                        if (!providerDetailHolderModel2.isAvailable()) {
                            providerDetailHolderModel2 = null;
                        }
                        if (providerDetailHolderModel2 != null) {
                            w<hs.f<String, ProviderDetailHolderModel>> wVar2 = dVar.C;
                            InAppPromptData providerData2 = ((PopupItemModel.VideoClickDropOff) popupItemModel).getProviderData();
                            if (providerData2 != null) {
                                str7 = providerData2.getStatus();
                            }
                            wVar2.i(new hs.f<>(str7, providerDetailHolderModel2));
                        }
                    }
                    arrayList.set(2, new hs.f<>("providerVideoDropOff", Constants.SUBSCRIPTION_NONE));
                    MyApplication.V.a().N = false;
                }
            } else {
                sp.b.d0(obj);
                providerDetailHolderModel = (ProviderDetailHolderModel) obj;
                if (providerDetailHolderModel != null) {
                    if (!providerDetailHolderModel.isAvailable()) {
                        providerDetailHolderModel = null;
                    }
                    if (providerDetailHolderModel != null) {
                        w<hs.f<String, ProviderDetailHolderModel>> wVar3 = dVar.f23395z;
                        InAppPromptData providerData3 = ((PopupItemModel.BookDropOff) popupItemModel).getProviderData();
                        if (providerData3 != null) {
                            str7 = providerData3.getStatus();
                        }
                        wVar3.i(new hs.f<>(str7, providerDetailHolderModel));
                    }
                }
                arrayList.set(0, new hs.f<>("providerBookDropOff", "active"));
                MyApplication.V.a().N = false;
            }
        } else {
            sp.b.d0(obj);
            if (popupItemModel instanceof PopupItemModel.BookDropOff) {
                im.c cVar = dVar.f23394y;
                PopupItemModel.BookDropOff bookDropOff = (PopupItemModel.BookDropOff) popupItemModel;
                InAppPromptData providerData4 = bookDropOff.getProviderData();
                if (providerData4 != null) {
                    str5 = providerData4.getProviderType();
                } else {
                    str5 = null;
                }
                InAppPromptData providerData5 = bookDropOff.getProviderData();
                if (providerData5 != null && (uuidList3 = providerData5.getUuidList()) != null) {
                    str6 = (String) u.i2(uuidList3);
                } else {
                    str6 = null;
                }
                this.f23428u = 1;
                cVar.getClass();
                obj = im.c.c(str5, str6, this);
                if (obj == aVar) {
                    return aVar;
                }
                providerDetailHolderModel = (ProviderDetailHolderModel) obj;
                if (providerDetailHolderModel != null) {
                }
                arrayList.set(0, new hs.f<>("providerBookDropOff", "active"));
                MyApplication.V.a().N = false;
            } else if (popupItemModel instanceof PopupItemModel.MatchingDropOff) {
                PopupItemModel.MatchingDropOff matchingDropOff = (PopupItemModel.MatchingDropOff) popupItemModel;
                dVar.B.i(new hs.f<>(matchingDropOff.getStatus(), matchingDropOff.getReason()));
                if (kotlin.jvm.internal.i.b(matchingDropOff.getStatus(), "pending")) {
                    MyApplication.V.a().N = false;
                }
            } else if (popupItemModel instanceof PopupItemModel.VideoClickDropOff) {
                im.c cVar2 = dVar.f23394y;
                PopupItemModel.VideoClickDropOff videoClickDropOff = (PopupItemModel.VideoClickDropOff) popupItemModel;
                InAppPromptData providerData6 = videoClickDropOff.getProviderData();
                if (providerData6 != null) {
                    str3 = providerData6.getProviderType();
                } else {
                    str3 = null;
                }
                InAppPromptData providerData7 = videoClickDropOff.getProviderData();
                if (providerData7 != null && (uuidList2 = providerData7.getUuidList()) != null) {
                    str4 = (String) u.i2(uuidList2);
                } else {
                    str4 = null;
                }
                this.f23428u = 2;
                cVar2.getClass();
                obj = im.c.c(str3, str4, this);
                if (obj == aVar) {
                    return aVar;
                }
                providerDetailHolderModel2 = (ProviderDetailHolderModel) obj;
                if (providerDetailHolderModel2 != null) {
                }
                arrayList.set(2, new hs.f<>("providerVideoDropOff", Constants.SUBSCRIPTION_NONE));
                MyApplication.V.a().N = false;
            } else if (popupItemModel instanceof PopupItemModel.ProfileViewDropOff) {
                im.c cVar3 = dVar.f23394y;
                PopupItemModel.ProfileViewDropOff profileViewDropOff = (PopupItemModel.ProfileViewDropOff) popupItemModel;
                InAppPromptData providerData8 = profileViewDropOff.getProviderData();
                if (providerData8 != null) {
                    str = providerData8.getProviderType();
                } else {
                    str = null;
                }
                InAppPromptData providerData9 = profileViewDropOff.getProviderData();
                if (providerData9 != null && (uuidList = providerData9.getUuidList()) != null) {
                    str2 = (String) u.i2(uuidList);
                } else {
                    str2 = null;
                }
                this.f23428u = 3;
                cVar3.getClass();
                obj = im.c.c(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
                providerDetailHolderModel3 = (ProviderDetailHolderModel) obj;
                if (providerDetailHolderModel3 != null) {
                }
                arrayList.set(3, new hs.f<>("providerProfileDropOff", Constants.SUBSCRIPTION_NONE));
                MyApplication.V.a().N = false;
            } else if (popupItemModel instanceof PopupItemModel.NpsDayFive) {
                ((w) dVar.E.getValue()).i(new SingleUseEvent("nps"));
                NpsPersistence.INSTANCE.updateDashboardNpsForDay(5, true);
            } else if (popupItemModel instanceof PopupItemModel.DashboardPopup) {
                ((w) dVar.E.getValue()).i(new SingleUseEvent(((PopupItemModel.DashboardPopup) popupItemModel).getSlug()));
            }
        }
        im.c cVar4 = dVar.f23394y;
        this.f23428u = 4;
        if (cVar4.d(arrayList, this) == aVar) {
            return aVar;
        }
        return k.f19476a;
    }
}
