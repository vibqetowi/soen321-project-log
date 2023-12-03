package hr;

import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h5 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18529u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f18530v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f18531w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i5 f18532x;

    public /* synthetic */ h5(TemplateActivity templateActivity, String str, i5 i5Var) {
        this.f18530v = templateActivity;
        this.f18531w = str;
        this.f18532x = i5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103 A[Catch: Exception -> 0x03b2, TryCatch #0 {Exception -> 0x03b2, blocks: (B:6:0x0030, B:27:0x00b1, B:30:0x00b9, B:32:0x00c1, B:100:0x03aa, B:33:0x00d9, B:34:0x00f0, B:37:0x00fa, B:39:0x0103, B:40:0x011d, B:42:0x0125, B:43:0x013d, B:44:0x0154, B:47:0x015c, B:49:0x0164, B:50:0x017c, B:53:0x0187, B:54:0x01a8, B:55:0x01c9, B:58:0x01d3, B:60:0x01db, B:62:0x01e5, B:63:0x01fd, B:64:0x0215, B:66:0x021e, B:68:0x0228, B:69:0x0240, B:70:0x025a, B:83:0x02db, B:85:0x02e3, B:86:0x02fb, B:14:0x0060, B:17:0x0068, B:19:0x0070, B:20:0x0088, B:21:0x009f, B:24:0x00a9, B:71:0x0271, B:74:0x027a, B:76:0x0282, B:77:0x029a, B:79:0x02a2, B:80:0x02b3, B:81:0x02d1, B:87:0x0312, B:89:0x031a, B:91:0x0324, B:92:0x033b, B:93:0x0354, B:95:0x035d, B:97:0x0367, B:98:0x037e, B:99:0x0395), top: B:119:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d A[Catch: Exception -> 0x03b2, TryCatch #0 {Exception -> 0x03b2, blocks: (B:6:0x0030, B:27:0x00b1, B:30:0x00b9, B:32:0x00c1, B:100:0x03aa, B:33:0x00d9, B:34:0x00f0, B:37:0x00fa, B:39:0x0103, B:40:0x011d, B:42:0x0125, B:43:0x013d, B:44:0x0154, B:47:0x015c, B:49:0x0164, B:50:0x017c, B:53:0x0187, B:54:0x01a8, B:55:0x01c9, B:58:0x01d3, B:60:0x01db, B:62:0x01e5, B:63:0x01fd, B:64:0x0215, B:66:0x021e, B:68:0x0228, B:69:0x0240, B:70:0x025a, B:83:0x02db, B:85:0x02e3, B:86:0x02fb, B:14:0x0060, B:17:0x0068, B:19:0x0070, B:20:0x0088, B:21:0x009f, B:24:0x00a9, B:71:0x0271, B:74:0x027a, B:76:0x0282, B:77:0x029a, B:79:0x02a2, B:80:0x02b3, B:81:0x02d1, B:87:0x0312, B:89:0x031a, B:91:0x0324, B:92:0x033b, B:93:0x0354, B:95:0x035d, B:97:0x0367, B:98:0x037e, B:99:0x0395), top: B:119:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164 A[Catch: Exception -> 0x03b2, TryCatch #0 {Exception -> 0x03b2, blocks: (B:6:0x0030, B:27:0x00b1, B:30:0x00b9, B:32:0x00c1, B:100:0x03aa, B:33:0x00d9, B:34:0x00f0, B:37:0x00fa, B:39:0x0103, B:40:0x011d, B:42:0x0125, B:43:0x013d, B:44:0x0154, B:47:0x015c, B:49:0x0164, B:50:0x017c, B:53:0x0187, B:54:0x01a8, B:55:0x01c9, B:58:0x01d3, B:60:0x01db, B:62:0x01e5, B:63:0x01fd, B:64:0x0215, B:66:0x021e, B:68:0x0228, B:69:0x0240, B:70:0x025a, B:83:0x02db, B:85:0x02e3, B:86:0x02fb, B:14:0x0060, B:17:0x0068, B:19:0x0070, B:20:0x0088, B:21:0x009f, B:24:0x00a9, B:71:0x0271, B:74:0x027a, B:76:0x0282, B:77:0x029a, B:79:0x02a2, B:80:0x02b3, B:81:0x02d1, B:87:0x0312, B:89:0x031a, B:91:0x0324, B:92:0x033b, B:93:0x0354, B:95:0x035d, B:97:0x0367, B:98:0x037e, B:99:0x0395), top: B:119:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c A[Catch: Exception -> 0x03b2, TRY_LEAVE, TryCatch #0 {Exception -> 0x03b2, blocks: (B:6:0x0030, B:27:0x00b1, B:30:0x00b9, B:32:0x00c1, B:100:0x03aa, B:33:0x00d9, B:34:0x00f0, B:37:0x00fa, B:39:0x0103, B:40:0x011d, B:42:0x0125, B:43:0x013d, B:44:0x0154, B:47:0x015c, B:49:0x0164, B:50:0x017c, B:53:0x0187, B:54:0x01a8, B:55:0x01c9, B:58:0x01d3, B:60:0x01db, B:62:0x01e5, B:63:0x01fd, B:64:0x0215, B:66:0x021e, B:68:0x0228, B:69:0x0240, B:70:0x025a, B:83:0x02db, B:85:0x02e3, B:86:0x02fb, B:14:0x0060, B:17:0x0068, B:19:0x0070, B:20:0x0088, B:21:0x009f, B:24:0x00a9, B:71:0x0271, B:74:0x027a, B:76:0x0282, B:77:0x029a, B:79:0x02a2, B:80:0x02b3, B:81:0x02d1, B:87:0x0312, B:89:0x031a, B:91:0x0324, B:92:0x033b, B:93:0x0354, B:95:0x035d, B:97:0x0367, B:98:0x037e, B:99:0x0395), top: B:119:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e3 A[Catch: Exception -> 0x03b2, TryCatch #0 {Exception -> 0x03b2, blocks: (B:6:0x0030, B:27:0x00b1, B:30:0x00b9, B:32:0x00c1, B:100:0x03aa, B:33:0x00d9, B:34:0x00f0, B:37:0x00fa, B:39:0x0103, B:40:0x011d, B:42:0x0125, B:43:0x013d, B:44:0x0154, B:47:0x015c, B:49:0x0164, B:50:0x017c, B:53:0x0187, B:54:0x01a8, B:55:0x01c9, B:58:0x01d3, B:60:0x01db, B:62:0x01e5, B:63:0x01fd, B:64:0x0215, B:66:0x021e, B:68:0x0228, B:69:0x0240, B:70:0x025a, B:83:0x02db, B:85:0x02e3, B:86:0x02fb, B:14:0x0060, B:17:0x0068, B:19:0x0070, B:20:0x0088, B:21:0x009f, B:24:0x00a9, B:71:0x0271, B:74:0x027a, B:76:0x0282, B:77:0x029a, B:79:0x02a2, B:80:0x02b3, B:81:0x02d1, B:87:0x0312, B:89:0x031a, B:91:0x0324, B:92:0x033b, B:93:0x0354, B:95:0x035d, B:97:0x0367, B:98:0x037e, B:99:0x0395), top: B:119:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fb A[Catch: Exception -> 0x03b2, TryCatch #0 {Exception -> 0x03b2, blocks: (B:6:0x0030, B:27:0x00b1, B:30:0x00b9, B:32:0x00c1, B:100:0x03aa, B:33:0x00d9, B:34:0x00f0, B:37:0x00fa, B:39:0x0103, B:40:0x011d, B:42:0x0125, B:43:0x013d, B:44:0x0154, B:47:0x015c, B:49:0x0164, B:50:0x017c, B:53:0x0187, B:54:0x01a8, B:55:0x01c9, B:58:0x01d3, B:60:0x01db, B:62:0x01e5, B:63:0x01fd, B:64:0x0215, B:66:0x021e, B:68:0x0228, B:69:0x0240, B:70:0x025a, B:83:0x02db, B:85:0x02e3, B:86:0x02fb, B:14:0x0060, B:17:0x0068, B:19:0x0070, B:20:0x0088, B:21:0x009f, B:24:0x00a9, B:71:0x0271, B:74:0x027a, B:76:0x0282, B:77:0x029a, B:79:0x02a2, B:80:0x02b3, B:81:0x02d1, B:87:0x0312, B:89:0x031a, B:91:0x0324, B:92:0x033b, B:93:0x0354, B:95:0x035d, B:97:0x0367, B:98:0x037e, B:99:0x0395), top: B:119:0x0030 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i6 = this.f18529u;
        TemplateActivity act = this.f18530v;
        i5 this$0 = this.f18532x;
        String slug = this.f18531w;
        switch (i6) {
            case 0:
                int i10 = i5.A;
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                try {
                    int hashCode = slug.hashCode();
                    HashSet<String> hashSet = this$0.f18578w;
                    HashMap<String, Object> hashMap = act.F;
                    if (hashCode != 112084) {
                        if (hashCode != 3474661) {
                            switch (hashCode) {
                                case 3474703:
                                    if (!slug.equals("s12c")) {
                                        if (this$0.f18579x.size() != 0) {
                                            Utils utils = Utils.INSTANCE;
                                            androidx.fragment.app.p activity = this$0.getActivity();
                                            kotlin.jvm.internal.i.d(activity);
                                            String string = this$0.getString(R.string.select_option);
                                            kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                                            utils.showCustomToast(activity, string);
                                            break;
                                        } else {
                                            hashMap.put("list", new ArrayList(this$0.f18579x));
                                            hashMap.put("userAdded", new ArrayList(hashSet));
                                            act.t0();
                                            break;
                                        }
                                    }
                                    if (this$0.f18579x.size() != 0) {
                                        Utils utils2 = Utils.INSTANCE;
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.d(activity2);
                                        String string2 = this$0.getString(R.string.select_option);
                                        kotlin.jvm.internal.i.f(string2, "getString(R.string.select_option)");
                                        utils2.showCustomToast(activity2, string2);
                                        break;
                                    } else if (this$0.f18579x.size() == 1) {
                                        hashMap.put("list", new ArrayList(this$0.f18579x));
                                        hashMap.put("userAdded", new ArrayList(hashSet));
                                        hashMap.put("singleSelection", Boolean.TRUE);
                                        act.s0(new t8());
                                        break;
                                    } else {
                                        hashMap.put("list", new ArrayList(this$0.f18579x));
                                        hashMap.put("userAdded", new ArrayList(hashSet));
                                        hashMap.put("singleSelection", Boolean.FALSE);
                                        act.s0(new r6());
                                        break;
                                    }
                                case 3474704:
                                    if (!slug.equals("s12d")) {
                                        if (this$0.f18579x.size() != 0) {
                                        }
                                    }
                                    if (this$0.f18579x.size() >= 2) {
                                        Utils utils3 = Utils.INSTANCE;
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        kotlin.jvm.internal.i.d(activity3);
                                        String string3 = this$0.getString(R.string.select_any_2);
                                        kotlin.jvm.internal.i.f(string3, "getString(R.string.select_any_2)");
                                        utils3.showCustomToast(activity3, string3);
                                        break;
                                    } else if (this$0.f18579x.size() > 10) {
                                        Utils utils4 = Utils.INSTANCE;
                                        androidx.fragment.app.p activity4 = this$0.getActivity();
                                        kotlin.jvm.internal.i.d(activity4);
                                        String string4 = this$0.getString(R.string.max_10_options_to_select);
                                        kotlin.jvm.internal.i.f(string4, "getString(R.string.max_10_options_to_select)");
                                        utils4.showCustomToast(activity4, string4);
                                        break;
                                    } else {
                                        hashMap.put("list", new ArrayList(this$0.f18579x));
                                        hashMap.put("userAdded", new ArrayList(hashSet));
                                        act.t0();
                                        break;
                                    }
                                    break;
                                case 3474705:
                                    if (slug.equals("s12e")) {
                                        if (this$0.f18579x.size() == 0) {
                                            Utils utils5 = Utils.INSTANCE;
                                            androidx.fragment.app.p activity5 = this$0.getActivity();
                                            kotlin.jvm.internal.i.d(activity5);
                                            String string5 = this$0.getString(R.string.select_option);
                                            kotlin.jvm.internal.i.f(string5, "getString(R.string.select_option)");
                                            utils5.showCustomToast(activity5, string5);
                                            break;
                                        } else {
                                            hashMap.put("list", new ArrayList(this$0.f18579x));
                                            hashMap.put("userAdded", new ArrayList(hashSet));
                                            act.t0();
                                            break;
                                        }
                                    } else if (this$0.f18579x.size() != 0) {
                                    }
                                    break;
                                default:
                                    switch (hashCode) {
                                        case 107714217:
                                            if (slug.equals("s12-b")) {
                                                if (this$0.f18579x.size() == 0) {
                                                    if (this$0.f18577v.containsKey("s12b_error_1")) {
                                                        Utils utils6 = Utils.INSTANCE;
                                                        androidx.fragment.app.p activity6 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.d(activity6);
                                                        utils6.showCustomToast(activity6, UtilFunKt.paramsMapToString(this$0.f18577v.get("s12b_error_1")));
                                                        break;
                                                    } else {
                                                        Utils utils7 = Utils.INSTANCE;
                                                        androidx.fragment.app.p activity7 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.d(activity7);
                                                        String string6 = this$0.getString(R.string.select_option);
                                                        kotlin.jvm.internal.i.f(string6, "getString(R.string.select_option)");
                                                        utils7.showCustomToast(activity7, string6);
                                                        break;
                                                    }
                                                } else if (this$0.f18579x.size() > 3) {
                                                    if (this$0.f18577v.containsKey("s12b_error_2")) {
                                                        Utils utils8 = Utils.INSTANCE;
                                                        androidx.fragment.app.p activity8 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.d(activity8);
                                                        utils8.showCustomToast(activity8, UtilFunKt.paramsMapToString(this$0.f18577v.get("s12b_error_2")));
                                                        break;
                                                    } else {
                                                        Utils utils9 = Utils.INSTANCE;
                                                        androidx.fragment.app.p activity9 = this$0.getActivity();
                                                        kotlin.jvm.internal.i.d(activity9);
                                                        String string7 = this$0.getString(R.string.max_3_options_to_select);
                                                        kotlin.jvm.internal.i.f(string7, "getString(R.string.max_3_options_to_select)");
                                                        utils9.showCustomToast(activity9, string7);
                                                        break;
                                                    }
                                                } else {
                                                    hashMap.put("list", new ArrayList(this$0.f18579x));
                                                    hashMap.put("userAdded", new ArrayList(hashSet));
                                                    act.t0();
                                                    break;
                                                }
                                            } else if (this$0.f18579x.size() != 0) {
                                            }
                                            break;
                                        case 107714218:
                                            if (!slug.equals("s12-c")) {
                                                if (this$0.f18579x.size() != 0) {
                                                }
                                            }
                                            if (this$0.f18579x.size() != 0) {
                                            }
                                            break;
                                        case 107714219:
                                            if (!slug.equals("s12-d")) {
                                                if (this$0.f18579x.size() != 0) {
                                                }
                                            }
                                            if (this$0.f18579x.size() >= 2) {
                                            }
                                            break;
                                        case 107714220:
                                            if (slug.equals("s12-e")) {
                                                if (this$0.f18579x.size() == 0) {
                                                    Utils utils10 = Utils.INSTANCE;
                                                    androidx.fragment.app.p activity10 = this$0.getActivity();
                                                    kotlin.jvm.internal.i.d(activity10);
                                                    String string8 = this$0.getString(R.string.select_option);
                                                    kotlin.jvm.internal.i.f(string8, "getString(R.string.select_option)");
                                                    utils10.showCustomToast(activity10, string8);
                                                    break;
                                                } else {
                                                    hashMap.put("list", new ArrayList(this$0.f18579x));
                                                    hashMap.put("userAdded", new ArrayList(hashSet));
                                                    act.t0();
                                                    break;
                                                }
                                            } else if (this$0.f18579x.size() != 0) {
                                            }
                                            break;
                                        default:
                                            if (this$0.f18579x.size() != 0) {
                                            }
                                            break;
                                    }
                            }
                            hashMap.put("s12_user_list", this$0.f18579x);
                            return;
                        } else if (slug.equals("s129")) {
                            if (this$0.f18579x.size() == 0) {
                                Utils utils11 = Utils.INSTANCE;
                                androidx.fragment.app.p activity11 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity11);
                                String string9 = this$0.getString(R.string.select_option);
                                kotlin.jvm.internal.i.f(string9, "getString(R.string.select_option)");
                                utils11.showCustomToast(activity11, string9);
                            } else if (this$0.f18579x.size() > 10) {
                                Utils utils12 = Utils.INSTANCE;
                                String string10 = this$0.getString(R.string.max_10_options_to_select);
                                kotlin.jvm.internal.i.f(string10, "getString(R.string.max_10_options_to_select)");
                                utils12.showCustomToast(act, string10);
                            } else {
                                hashMap.put("s129_list", new ArrayList(this$0.f18579x));
                                hashMap.put("userAdded", new ArrayList(hashSet));
                                act.s0(new z7());
                            }
                            hashMap.put("s12_user_list", this$0.f18579x);
                            return;
                        } else {
                            if (this$0.f18579x.size() != 0) {
                            }
                            hashMap.put("s12_user_list", this$0.f18579x);
                            return;
                        }
                    }
                    if (slug.equals("s12")) {
                        if (this$0.f18579x.size() == 0) {
                            if (this$0.f18577v.containsKey("s12_error_1")) {
                                Utils utils13 = Utils.INSTANCE;
                                androidx.fragment.app.p activity12 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity12);
                                utils13.showCustomToast(activity12, UtilFunKt.paramsMapToString(this$0.f18577v.get("s12_error_1")));
                            } else {
                                Utils utils14 = Utils.INSTANCE;
                                androidx.fragment.app.p activity13 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity13);
                                String string11 = this$0.getString(R.string.select_1_option);
                                kotlin.jvm.internal.i.f(string11, "getString(R.string.select_1_option)");
                                utils14.showCustomToast(activity13, string11);
                            }
                        } else if (this$0.f18579x.size() > 3) {
                            if (this$0.f18577v.containsKey("s12_error_2")) {
                                Utils utils15 = Utils.INSTANCE;
                                androidx.fragment.app.p activity14 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity14);
                                utils15.showCustomToast(activity14, UtilFunKt.paramsMapToString(this$0.f18577v.get("s12_error_2")));
                            } else {
                                Utils utils16 = Utils.INSTANCE;
                                androidx.fragment.app.p activity15 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity15);
                                String string12 = this$0.getString(R.string.max_3_options_to_select);
                                kotlin.jvm.internal.i.f(string12, "getString(R.string.max_3_options_to_select)");
                                utils16.showCustomToast(activity15, string12);
                            }
                        } else {
                            hashMap.put("list", new ArrayList(this$0.f18579x));
                            hashMap.put("userAdded", new ArrayList(hashSet));
                            act.t0();
                        }
                        hashMap.put("s12_user_list", this$0.f18579x);
                        return;
                    }
                    if (this$0.f18579x.size() != 0) {
                    }
                    hashMap.put("s12_user_list", this$0.f18579x);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f18576u, "exception", e10);
                    return;
                }
            default:
                int i11 = i5.A;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (act.getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                    act.Q = true;
                    if (ca.a.k("s12e", "s12-e").contains(slug)) {
                        act.J0();
                        return;
                    } else if (ca.a.k("s12c", "s12-c").contains(slug)) {
                        act.s0(new t8());
                        return;
                    } else {
                        return;
                    }
                }
                androidx.fragment.app.p activity16 = this$0.getActivity();
                if (activity16 != null) {
                    activity16.onBackPressed();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h5(String str, i5 i5Var, TemplateActivity templateActivity) {
        this.f18531w = str;
        this.f18532x = i5Var;
        this.f18530v = templateActivity;
    }
}
