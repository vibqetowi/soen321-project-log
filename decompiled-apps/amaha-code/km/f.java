package km;

import androidx.lifecycle.w;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptData;
import com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: InAppPromptsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.inAppFunneling.viewmodel.InAppPromptsViewModel$performInAppPromptsCheck$2$1", f = "InAppPromptsViewModel.kt", l = {173, 186, 212}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i implements p<d0, ls.d<? super k>, Object> {
    public InAppPromptData A;
    public InAppPromptData B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ d F;
    public final /* synthetic */ ls.d<hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<String, String>>>> G;
    public final /* synthetic */ boolean H;

    /* renamed from: u  reason: collision with root package name */
    public x f23422u;

    /* renamed from: v  reason: collision with root package name */
    public d f23423v;

    /* renamed from: w  reason: collision with root package name */
    public ls.d f23424w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f23425x;

    /* renamed from: y  reason: collision with root package name */
    public InAppPromptData f23426y;

    /* renamed from: z  reason: collision with root package name */
    public InAppPromptData f23427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(d dVar, ls.d<? super hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<String, String>>>> dVar2, boolean z10, ls.d<? super f> dVar3) {
        super(2, dVar3);
        this.F = dVar;
        this.G = dVar2;
        this.H = z10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        f fVar = new f(this.F, this.G, this.H, dVar);
        fVar.E = obj;
        return fVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x043b, code lost:
        if (kotlin.jvm.internal.i.b(r1, r8) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1  */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel$ProfileViewDropOff] */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel$VideoClickDropOff] */
    /* JADX WARN: Type inference failed for: r1v38, types: [T, com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel$MatchingDropOff] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel$BookDropOff] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        int i6;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        boolean z10;
        Object b10;
        int i10;
        x xVar;
        String str3;
        String j02;
        Object obj4;
        Object S;
        ArrayList arrayList;
        k kVar;
        Object obj5;
        Object obj6;
        ArrayList<String> arrayList2;
        Object obj7;
        InAppPromptData inAppPromptData;
        Object obj8;
        InAppPromptData inAppPromptData2;
        InAppPromptData inAppPromptData3;
        Object obj9;
        Object obj10;
        Object obj11;
        InAppPromptData inAppPromptData4;
        Object obj12;
        String str4;
        Object obj13;
        String str5;
        String str6;
        Object obj14;
        String str7;
        String str8;
        String str9;
        ls.d<hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<String, String>>>> dVar;
        String str10;
        String str11;
        String str12;
        String str13;
        Object c10;
        InAppPromptData inAppPromptData5;
        InAppPromptData inAppPromptData6;
        InAppPromptData inAppPromptData7;
        int i11;
        ls.d<hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<String, String>>>> dVar2;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z11;
        String str19;
        String str20;
        String str21;
        String str22;
        T t3;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        ProviderDetailHolderModel providerDetailHolderModel;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i12 = this.D;
        ls.d<hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<String, String>>>> dVar3 = this.G;
        d dVar4 = this.F;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        int i13 = this.C;
                        inAppPromptData5 = this.B;
                        InAppPromptData inAppPromptData8 = this.A;
                        inAppPromptData6 = this.f23427z;
                        inAppPromptData = this.f23426y;
                        arrayList2 = this.f23425x;
                        ls.d<hs.f<? extends PopupItemModel, ? extends ArrayList<hs.f<String, String>>>> dVar5 = this.f23424w;
                        d dVar6 = this.f23423v;
                        x xVar2 = this.f23422u;
                        d0 d0Var2 = (d0) this.E;
                        sp.b.d0(obj);
                        str8 = "pending";
                        dVar2 = dVar5;
                        obj9 = "providerVideoDropOff";
                        str9 = Constants.SUBSCRIPTION_NONE;
                        i11 = i13;
                        xVar = xVar2;
                        obj12 = "providerProfileDropOff";
                        obj14 = "providerBookDropOff";
                        str7 = "active";
                        inAppPromptData7 = inAppPromptData8;
                        dVar4 = dVar6;
                        obj13 = "providerMatchingDropOff";
                        c10 = obj;
                        providerDetailHolderModel = (ProviderDetailHolderModel) c10;
                        if (providerDetailHolderModel != null) {
                            dVar4.f23395z.i(new hs.f<>(inAppPromptData5.getStatus(), providerDetailHolderModel));
                        }
                        dVar = dVar2;
                        inAppPromptData3 = inAppPromptData6;
                        str11 = null;
                        str12 = null;
                        i10 = i11;
                        inAppPromptData4 = inAppPromptData7;
                        str10 = null;
                        dVar4.A.i(arrayList2);
                        if (arrayList2 == null && (!arrayList2.isEmpty())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w<hs.f<String, String>> wVar = dVar4.B;
                        if (!z11) {
                            str20 = str8;
                            String[] strArr = {str20, str7};
                            if (inAppPromptData != null) {
                                str35 = inAppPromptData.getStatus();
                            } else {
                                str35 = null;
                            }
                            if (is.k.Q1(str35, strArr)) {
                                str19 = str9;
                                wVar.i(new hs.f<>(str19, null));
                                str10 = str19;
                            } else {
                                str19 = str9;
                            }
                        } else {
                            str19 = str9;
                            str20 = str8;
                            if (dVar4.H) {
                                dVar4.H = false;
                                if (inAppPromptData != null) {
                                    str21 = inAppPromptData.getReason();
                                } else {
                                    str21 = null;
                                }
                                wVar.i(new hs.f<>(str7, str21));
                                str10 = str7;
                            }
                        }
                        if (str10 == null) {
                            if (inAppPromptData != null) {
                                str26 = inAppPromptData.getStatus();
                            } else {
                                str26 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str26, str20)) {
                                if (inAppPromptData3 != null) {
                                    str33 = inAppPromptData3.getStatus();
                                } else {
                                    str33 = null;
                                }
                                if (kotlin.jvm.internal.i.b(str33, str20)) {
                                    str11 = str19;
                                }
                                if (inAppPromptData4 != null) {
                                    str34 = inAppPromptData4.getStatus();
                                } else {
                                    str34 = null;
                                }
                                if (kotlin.jvm.internal.i.b(str34, str20)) {
                                    str12 = str19;
                                }
                            }
                            if (i10 == 0) {
                                if (inAppPromptData != null) {
                                    str32 = inAppPromptData.getStatus();
                                } else {
                                    str32 = null;
                                }
                            }
                            hs.f<String, String> d10 = wVar.d();
                            if (d10 != null) {
                                str27 = d10.f19464u;
                            } else {
                                str27 = null;
                            }
                            if (inAppPromptData != null) {
                                str28 = inAppPromptData.getStatus();
                            } else {
                                str28 = null;
                            }
                            if (!kotlin.jvm.internal.i.b(str27, str28)) {
                                if (inAppPromptData != null) {
                                    str29 = inAppPromptData.getStatus();
                                } else {
                                    str29 = null;
                                }
                                if (kotlin.jvm.internal.i.b(str29, str20)) {
                                    xVar.f23469u = new PopupItemModel.MatchingDropOff(str20, inAppPromptData.getReason());
                                } else {
                                    if (inAppPromptData != null) {
                                        str30 = inAppPromptData.getStatus();
                                    } else {
                                        str30 = null;
                                    }
                                    if (inAppPromptData != null) {
                                        str31 = inAppPromptData.getReason();
                                    } else {
                                        str31 = null;
                                    }
                                    wVar.i(new hs.f<>(str30, str31));
                                }
                            }
                        }
                        if (str11 == null) {
                            if (inAppPromptData3 != null) {
                                str24 = inAppPromptData3.getStatus();
                            } else {
                                str24 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str24, str20)) {
                                if (i10 != 0) {
                                    xVar.f23469u = new PopupItemModel.VideoClickDropOff(inAppPromptData3.getStatus(), inAppPromptData3);
                                }
                                if (inAppPromptData4 != null) {
                                    str25 = inAppPromptData4.getStatus();
                                } else {
                                    str25 = null;
                                }
                                if (kotlin.jvm.internal.i.b(str25, str20)) {
                                    str22 = str19;
                                    if (str22 == null) {
                                        if (inAppPromptData4 != null) {
                                            str23 = inAppPromptData4.getStatus();
                                        } else {
                                            str23 = null;
                                        }
                                        if (kotlin.jvm.internal.i.b(str23, str20) && i10 != 0) {
                                            xVar.f23469u = new PopupItemModel.ProfileViewDropOff(inAppPromptData4.getStatus(), inAppPromptData4);
                                        }
                                    }
                                    boolean z12 = false;
                                    ArrayList k10 = ca.a.k(new hs.f(obj14, null), new hs.f(obj13, str10), new hs.f(obj9, str11), new hs.f(obj12, str22));
                                    dVar4.H = false;
                                    MyApplication a10 = MyApplication.V.a();
                                    t3 = xVar.f23469u;
                                    if (t3 != 0) {
                                        z12 = true;
                                    }
                                    a10.N = z12;
                                    dVar.resumeWith(new hs.f(t3, k10));
                                    kVar = k.f19476a;
                                    if (kVar == null) {
                                        dVar3.resumeWith(new hs.f(null, new ArrayList()));
                                    }
                                    return k.f19476a;
                                }
                            }
                        }
                        str22 = str12;
                        if (str22 == null) {
                        }
                        boolean z122 = false;
                        ArrayList k102 = ca.a.k(new hs.f(obj14, null), new hs.f(obj13, str10), new hs.f(obj9, str11), new hs.f(obj12, str22));
                        dVar4.H = false;
                        MyApplication a102 = MyApplication.V.a();
                        t3 = xVar.f23469u;
                        if (t3 != 0) {
                        }
                        a102.N = z122;
                        dVar.resumeWith(new hs.f(t3, k102));
                        kVar = k.f19476a;
                        if (kVar == null) {
                        }
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = this.C;
                xVar = this.f23422u;
                d0Var = (d0) this.E;
                sp.b.d0(obj);
                str2 = "pending";
                obj2 = "providerProfileDropOff";
                obj3 = "providerVideoDropOff";
                str = "active";
                i10 = i14;
                b10 = obj;
                arrayList = (ArrayList) b10;
                if (arrayList == null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj5 = it.next();
                            if (kotlin.jvm.internal.i.b(((InAppPromptData) obj5).getSlug(), "providerBookDropOff")) {
                                break;
                            }
                        } else {
                            obj5 = null;
                            break;
                        }
                    }
                    InAppPromptData inAppPromptData9 = (InAppPromptData) obj5;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj6 = it2.next();
                            if (kotlin.jvm.internal.i.b(((InAppPromptData) obj6).getSlug(), "providerMatchingList")) {
                                break;
                            }
                        } else {
                            obj6 = null;
                            break;
                        }
                    }
                    InAppPromptData inAppPromptData10 = (InAppPromptData) obj6;
                    if (inAppPromptData10 != null) {
                        arrayList2 = inAppPromptData10.getUuidList();
                    } else {
                        arrayList2 = null;
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj7 = it3.next();
                            if (kotlin.jvm.internal.i.b(((InAppPromptData) obj7).getSlug(), "providerMatchingDropOff")) {
                                break;
                            }
                        } else {
                            obj7 = null;
                            break;
                        }
                    }
                    inAppPromptData = (InAppPromptData) obj7;
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            Iterator it5 = it4;
                            String slug = ((InAppPromptData) next).getSlug();
                            inAppPromptData2 = next;
                            obj8 = obj3;
                            if (kotlin.jvm.internal.i.b(slug, obj8)) {
                                break;
                            }
                            it4 = it5;
                            obj3 = obj8;
                        } else {
                            obj8 = obj3;
                            inAppPromptData2 = null;
                            break;
                        }
                    }
                    inAppPromptData3 = inAppPromptData2;
                    Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj11 = it6.next();
                            Iterator it7 = it6;
                            obj9 = obj8;
                            obj10 = obj2;
                            if (kotlin.jvm.internal.i.b(((InAppPromptData) obj11).getSlug(), obj10)) {
                                break;
                            }
                            it6 = it7;
                            obj2 = obj10;
                            obj8 = obj9;
                        } else {
                            obj9 = obj8;
                            obj10 = obj2;
                            obj11 = null;
                            break;
                        }
                    }
                    inAppPromptData4 = (InAppPromptData) obj11;
                    if (inAppPromptData9 != null) {
                        String str36 = str2;
                        obj13 = "providerMatchingDropOff";
                        str5 = str36;
                        obj12 = obj10;
                        str4 = inAppPromptData9.getStatus();
                    } else {
                        obj12 = obj10;
                        str4 = null;
                        String str37 = str2;
                        obj13 = "providerMatchingDropOff";
                        str5 = str37;
                    }
                    if (kotlin.jvm.internal.i.b(str4, str5)) {
                        xVar.f23469u = new PopupItemModel.BookDropOff(inAppPromptData9.getStatus(), inAppPromptData9);
                        if (inAppPromptData != null) {
                            str14 = inAppPromptData.getStatus();
                        } else {
                            str14 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str14, str5)) {
                            str15 = Constants.SUBSCRIPTION_NONE;
                        } else {
                            str15 = null;
                        }
                        if (inAppPromptData3 != null) {
                            str16 = inAppPromptData3.getStatus();
                        } else {
                            str16 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str16, str5)) {
                            str17 = Constants.SUBSCRIPTION_NONE;
                        } else {
                            str17 = null;
                        }
                        if (inAppPromptData4 != null) {
                            str18 = inAppPromptData4.getStatus();
                        } else {
                            str18 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str18, str5)) {
                            str12 = Constants.SUBSCRIPTION_NONE;
                        } else {
                            str12 = null;
                        }
                        str8 = str5;
                        str9 = Constants.SUBSCRIPTION_NONE;
                        str11 = str17;
                        str10 = str15;
                        dVar = dVar3;
                        String str38 = str;
                        obj14 = "providerBookDropOff";
                        str7 = str38;
                    } else {
                        if (inAppPromptData9 != null) {
                            str6 = inAppPromptData9.getStatus();
                        } else {
                            str6 = null;
                        }
                        String str39 = str;
                        obj14 = "providerBookDropOff";
                        str7 = str39;
                        if (kotlin.jvm.internal.i.b(str6, str7)) {
                            im.c cVar = dVar4.f23394y;
                            str9 = Constants.SUBSCRIPTION_NONE;
                            String providerType = inAppPromptData9.getProviderType();
                            ArrayList<String> uuidList = inAppPromptData9.getUuidList();
                            if (uuidList != null) {
                                String str40 = (String) u.i2(uuidList);
                                str8 = str5;
                                str13 = str40;
                            } else {
                                str8 = str5;
                                str13 = null;
                            }
                            this.E = d0Var;
                            this.f23422u = xVar;
                            this.f23423v = dVar4;
                            this.f23424w = dVar3;
                            this.f23425x = arrayList2;
                            this.f23426y = inAppPromptData;
                            this.f23427z = inAppPromptData3;
                            this.A = inAppPromptData4;
                            this.B = inAppPromptData9;
                            this.C = i10;
                            this.D = 3;
                            cVar.getClass();
                            c10 = im.c.c(providerType, str13, this);
                            if (c10 == aVar) {
                                return aVar;
                            }
                            inAppPromptData5 = inAppPromptData9;
                            inAppPromptData6 = inAppPromptData3;
                            inAppPromptData7 = inAppPromptData4;
                            i11 = i10;
                            dVar2 = dVar3;
                            providerDetailHolderModel = (ProviderDetailHolderModel) c10;
                            if (providerDetailHolderModel != null) {
                            }
                            dVar = dVar2;
                            inAppPromptData3 = inAppPromptData6;
                            str11 = null;
                            str12 = null;
                            i10 = i11;
                            inAppPromptData4 = inAppPromptData7;
                            str10 = null;
                        } else {
                            str8 = str5;
                            str9 = Constants.SUBSCRIPTION_NONE;
                            dVar = dVar3;
                            str10 = null;
                            str11 = null;
                            str12 = null;
                        }
                    }
                    dVar4.A.i(arrayList2);
                    if (arrayList2 == null) {
                    }
                    z11 = false;
                    w<hs.f<String, String>> wVar2 = dVar4.B;
                    if (!z11) {
                    }
                    if (str10 == null) {
                    }
                    if (str11 == null) {
                    }
                    str22 = str12;
                    if (str22 == null) {
                    }
                    boolean z1222 = false;
                    ArrayList k1022 = ca.a.k(new hs.f(obj14, null), new hs.f(obj13, str10), new hs.f(obj9, str11), new hs.f(obj12, str22));
                    dVar4.H = false;
                    MyApplication a1022 = MyApplication.V.a();
                    t3 = xVar.f23469u;
                    if (t3 != 0) {
                    }
                    a1022.N = z1222;
                    dVar.resumeWith(new hs.f(t3, k1022));
                    kVar = k.f19476a;
                    if (kVar == null) {
                    }
                    return k.f19476a;
                }
                kVar = null;
                if (kVar == null) {
                }
                return k.f19476a;
            }
            sp.b.d0(obj);
            obj4 = null;
            dVar4.f23395z.i(new hs.f<>(Constants.SUBSCRIPTION_NONE, obj4));
            dVar3.resumeWith(new hs.f(obj4, new ArrayList()));
            return k.f19476a;
        }
        sp.b.d0(obj);
        d0Var = (d0) this.E;
        if (!dVar4.J) {
            dVar3.resumeWith(new hs.f(null, new ArrayList()));
            return k.f19476a;
        }
        boolean z13 = this.H;
        if (!z13 && !MyApplication.V.a().N) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        x xVar3 = new x();
        str = "active";
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
        str2 = "pending";
        String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
        obj2 = "providerProfileDropOff";
        String stringValue3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
        obj3 = "providerVideoDropOff";
        if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
            z10 = true;
        } else {
            z10 = false;
        }
        im.c cVar2 = dVar4.f23394y;
        if ((z13 && !MyApplication.V.a().N) || z10) {
            if (z10 && z13) {
                this.D = 1;
                cVar2.getClass();
                if (ApplicationPersistence.getInstance().getBooleanValue("inAppTeleRecordingStopped", false)) {
                    S = k.f19476a;
                    obj4 = null;
                } else {
                    obj4 = null;
                    S = v.S(o0.f23642c, new im.a(null), this);
                    if (S != aVar) {
                        S = k.f19476a;
                    }
                }
                if (S == aVar) {
                    return aVar;
                }
                dVar4.f23395z.i(new hs.f<>(Constants.SUBSCRIPTION_NONE, obj4));
                dVar3.resumeWith(new hs.f(obj4, new ArrayList()));
                return k.f19476a;
            }
            obj4 = null;
            dVar3.resumeWith(new hs.f(obj4, new ArrayList()));
            return k.f19476a;
        }
        if (z13 && MyApplication.V.a().N) {
            cVar2.getClass();
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_USER_IN_APP_FUNNELING_NODE.concat(j02)).keepSynced(true);
            }
        }
        this.E = d0Var;
        this.f23422u = xVar3;
        this.C = i6;
        this.D = 2;
        cVar2.getClass();
        ls.h hVar = new ls.h(ca.a.G0(this));
        try {
            fd.f fVar2 = FirebaseAuth.getInstance().f;
            if (fVar2 != null) {
                str3 = fVar2.j0();
            } else {
                str3 = null;
            }
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            DatabaseReference reference = firebaseDatabase.getReference(Constants.FIREBASE_USER_IN_APP_FUNNELING_NODE + str3);
            kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…APP_FUNNELING_NODE}$uid\")");
            reference.addListenerForSingleValueEvent(new im.b(hVar, reference));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar2.f20393a, e10);
        }
        b10 = hVar.b();
        if (b10 == aVar) {
            return aVar;
        }
        i10 = i6;
        xVar = xVar3;
        arrayList = (ArrayList) b10;
        if (arrayList == null) {
        }
    }
}
