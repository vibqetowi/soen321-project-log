package com.theinnerhour.b2b.utils;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import gv.r;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
import ss.p;
import ta.v;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.Utils$checkAndDownloadProfileAssets$1", f = "Utils.kt", l = {1419}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Utils$checkAndDownloadProfileAssets$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utils$checkAndDownloadProfileAssets$1(Context context, ls.d<? super Utils$checkAndDownloadProfileAssets$1> dVar) {
        super(2, dVar);
        this.$context = context;
    }

    public static final void invokeSuspend$lambda$4(u uVar, u uVar2, Context context, JSONObject jSONObject) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        String str3;
        User user;
        User user2;
        HashMap<String, Object> appConfig;
        try {
            if (jSONObject != null) {
                Object c10 = new sf.i().c(jSONObject.toString(), new TypeToken<ProfileAssetModel>() { // from class: com.theinnerhour.b2b.utils.Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$type$1
                }.getType());
                kotlin.jvm.internal.i.f(c10, "Gson().fromJson(it.toString(), type)");
                ProfileAssetModel profileAssetModel = (ProfileAssetModel) c10;
                Iterator<T> it = profileAssetModel.getAvatars().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ProfileAssetModel.ProfileAvatarAsset) obj).getDefault()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ProfileAssetModel.ProfileAvatarAsset profileAvatarAsset = (ProfileAssetModel.ProfileAvatarAsset) obj;
                if (profileAvatarAsset != null) {
                    str = profileAvatarAsset.getAvatar();
                } else {
                    str = null;
                }
                Iterator<T> it2 = profileAssetModel.getThemes().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((ProfileAssetModel.ProfileThemeAsset) obj2).getDefault()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                ProfileAssetModel.ProfileThemeAsset profileThemeAsset = (ProfileAssetModel.ProfileThemeAsset) obj2;
                if (profileThemeAsset != null) {
                    str2 = profileThemeAsset.getCoverImage();
                } else {
                    str2 = null;
                }
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                if (uVar.f23466u && str2 != null && (user2 = firebasePersistence.getUser()) != null && (appConfig = user2.getAppConfig()) != null) {
                    appConfig.put("profile_cover", str2);
                }
                if (str != null) {
                    str3 = r.V0("https:", str);
                } else {
                    str3 = null;
                }
                if (uVar2.f23466u && str3 != null && (user = firebasePersistence.getUser()) != null) {
                    user.setProfile_path(str3);
                }
                firebasePersistence.updateUserOnFirebase();
                v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$1$1$1(context, null), 3);
                return;
            }
            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), "profile asset api fail");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), e10);
        }
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new Utils$checkAndDownloadProfileAssets$1(this.$context, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x004a A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:54:0x0009, B:61:0x001c, B:63:0x0031, B:65:0x0037, B:70:0x0041, B:72:0x004a, B:74:0x0052, B:76:0x0056, B:78:0x005b, B:83:0x0065, B:84:0x0067, B:86:0x006b, B:89:0x0070, B:92:0x0081), top: B:97:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0056 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:54:0x0009, B:61:0x001c, B:63:0x0031, B:65:0x0037, B:70:0x0041, B:72:0x004a, B:74:0x0052, B:76:0x0056, B:78:0x005b, B:83:0x0065, B:84:0x0067, B:86:0x006b, B:89:0x0070, B:92:0x0081), top: B:97:0x0005 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        HashMap<String, Object> appConfig;
        String str;
        Object obj2;
        boolean z11;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = new u();
                u uVar2 = new u();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    String profile_path = user.getProfile_path();
                    if (profile_path != null && !gv.n.B0(profile_path)) {
                        z10 = false;
                        uVar.f23466u = z10;
                        appConfig = user.getAppConfig();
                        str = null;
                        if (appConfig == null) {
                            obj2 = appConfig.get("profile_cover");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        }
                        if (str != null && !gv.n.B0(str)) {
                            z11 = false;
                            uVar2.f23466u = z11;
                        }
                        z11 = true;
                        uVar2.f23466u = z11;
                    }
                    z10 = true;
                    uVar.f23466u = z10;
                    appConfig = user.getAppConfig();
                    str = null;
                    if (appConfig == null) {
                    }
                    if (obj2 instanceof String) {
                    }
                    if (str != null) {
                        z11 = false;
                        uVar2.f23466u = z11;
                    }
                    z11 = true;
                    uVar2.f23466u = z11;
                }
                if (!uVar2.f23466u && !uVar.f23466u) {
                    Utils utils = Utils.INSTANCE;
                    Context context = this.$context;
                    this.label = 1;
                    if (Utils.checkForUpdatedProfileAssets$default(utils, context, false, this, 2, null) == aVar) {
                        return aVar;
                    }
                }
                VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/get_avatar_theme", null, new o(uVar2, uVar, this.$context, 0), new CustomVolleyErrorListener() { // from class: com.theinnerhour.b2b.utils.Utils$checkAndDownloadProfileAssets$1$profileAssetRequest$2
                    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
                    public void onErrorResponse(VolleyError error) {
                        kotlin.jvm.internal.i.g(error, "error");
                        try {
                            super.onErrorResponse(error);
                            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), "https://api.theinnerhour.com/v1/get_avatar_theme", error);
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), "https://api.theinnerhour.com/v1/get_avatar_theme", e10);
                        }
                    }
                }));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(Utils.INSTANCE.getTAG_UTIL(), e10);
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((Utils$checkAndDownloadProfileAssets$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
