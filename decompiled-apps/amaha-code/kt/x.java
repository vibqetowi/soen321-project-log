package kt;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import gt.a;
import gt.b;
import gt.u;
import gt.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kt.v0;
import wu.g1;
import wu.j1;
import wu.n1;
/* compiled from: FunctionDescriptorImpl.java */
/* loaded from: classes2.dex */
public abstract class x extends q implements gt.u {
    public wu.b0 A;
    public List<gt.n0> B;
    public gt.n0 C;
    public gt.n0 D;
    public gt.z E;
    public gt.q F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Collection<? extends gt.u> S;
    public volatile ss.a<Collection<gt.u>> T;
    public final gt.u U;
    public final b.a V;
    public gt.u W;
    public Map<a.InterfaceC0261a<?>, Object> X;

    /* renamed from: y */
    public List<gt.v0> f23903y;

    /* renamed from: z */
    public List<z0> f23904z;

    /* compiled from: FunctionDescriptorImpl.java */
    /* loaded from: classes2.dex */
    public class a implements u.a<gt.u> {

        /* renamed from: a */
        public g1 f23905a;

        /* renamed from: b */
        public gt.j f23906b;

        /* renamed from: c */
        public gt.z f23907c;

        /* renamed from: d */
        public gt.q f23908d;

        /* renamed from: e */
        public gt.u f23909e;
        public b.a f;

        /* renamed from: g */
        public List<z0> f23910g;

        /* renamed from: h */
        public final List<gt.n0> f23911h;

        /* renamed from: i */
        public gt.n0 f23912i;

        /* renamed from: j */
        public gt.n0 f23913j;

        /* renamed from: k */
        public wu.b0 f23914k;

        /* renamed from: l */
        public fu.e f23915l;

        /* renamed from: m */
        public boolean f23916m;

        /* renamed from: n */
        public boolean f23917n;

        /* renamed from: o */
        public boolean f23918o;

        /* renamed from: p */
        public boolean f23919p;

        /* renamed from: q */
        public boolean f23920q;
        public List<gt.v0> r;

        /* renamed from: s */
        public ht.h f23921s;

        /* renamed from: t */
        public boolean f23922t;

        /* renamed from: u */
        public final LinkedHashMap f23923u;

        /* renamed from: v */
        public Boolean f23924v;

        /* renamed from: w */
        public boolean f23925w;

        /* renamed from: x */
        public final /* synthetic */ x f23926x;

        public a(x xVar, g1 g1Var, gt.j jVar, gt.z zVar, gt.q qVar, b.a aVar, List list, List list2, gt.n0 n0Var, wu.b0 b0Var) {
            if (g1Var != null) {
                if (jVar != null) {
                    if (zVar != null) {
                        if (qVar != null) {
                            if (aVar != null) {
                                if (list != null) {
                                    if (list2 != null) {
                                        if (b0Var != null) {
                                            this.f23926x = xVar;
                                            this.f23909e = null;
                                            this.f23913j = xVar.D;
                                            this.f23916m = true;
                                            this.f23917n = false;
                                            this.f23918o = false;
                                            this.f23919p = false;
                                            this.f23920q = xVar.N;
                                            this.r = null;
                                            this.f23921s = null;
                                            this.f23922t = xVar.O;
                                            this.f23923u = new LinkedHashMap();
                                            this.f23924v = null;
                                            this.f23925w = false;
                                            this.f23905a = g1Var;
                                            this.f23906b = jVar;
                                            this.f23907c = zVar;
                                            this.f23908d = qVar;
                                            this.f = aVar;
                                            this.f23910g = list;
                                            this.f23911h = list2;
                                            this.f23912i = n0Var;
                                            this.f23914k = b0Var;
                                            this.f23915l = null;
                                            return;
                                        }
                                        s(7);
                                        throw null;
                                    }
                                    s(6);
                                    throw null;
                                }
                                s(5);
                                throw null;
                            }
                            s(4);
                            throw null;
                        }
                        s(3);
                        throw null;
                    }
                    s(2);
                    throw null;
                }
                s(1);
                throw null;
            }
            s(0);
            throw null;
        }

        public static /* synthetic */ void s(int i6) {
            String str;
            int i10;
            switch (i6) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i6) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    i10 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                default:
                    i10 = 3;
                    break;
            }
            Object[] objArr = new Object[i10];
            switch (i6) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = SessionManager.KEY_NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    objArr[0] = "additionalAnnotations";
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                default:
                    objArr[0] = "substitution";
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i6) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    objArr[1] = "setSignatureChange";
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    objArr[1] = "setSubstitution";
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    objArr[1] = "putUserData";
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    objArr[1] = "getSubstitution";
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i6) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    objArr[2] = "setSubstitution";
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i6) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // gt.u.a
        public final u.a<gt.u> a(gt.j jVar) {
            if (jVar != null) {
                this.f23906b = jVar;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> b(List list) {
            this.f23910g = list;
            return this;
        }

        @Override // gt.u.a
        public final gt.u build() {
            return this.f23926x.N0(this);
        }

        @Override // gt.u.a
        public final u.a c(Boolean bool) {
            this.f23923u.put(rt.e.f31017b0, bool);
            return this;
        }

        @Override // gt.u.a
        public final u.a<gt.u> d(gt.z zVar) {
            if (zVar != null) {
                this.f23907c = zVar;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> e() {
            this.f23918o = true;
            return this;
        }

        @Override // gt.u.a
        public final u.a<gt.u> f() {
            this.f23922t = true;
            return this;
        }

        @Override // gt.u.a
        public final u.a g(gt.d dVar) {
            this.f23909e = dVar;
            return this;
        }

        @Override // gt.u.a
        public final u.a<gt.u> h(gt.n0 n0Var) {
            this.f23913j = n0Var;
            return this;
        }

        @Override // gt.u.a
        public final u.a i() {
            this.f23916m = false;
            return this;
        }

        @Override // gt.u.a
        public final u.a j() {
            this.r = is.w.f20676u;
            return this;
        }

        @Override // gt.u.a
        public final u.a<gt.u> k(gt.q qVar) {
            if (qVar != null) {
                this.f23908d = qVar;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> l() {
            this.f23920q = true;
            return this;
        }

        @Override // gt.u.a
        public final u.a<gt.u> m(fu.e eVar) {
            if (eVar != null) {
                this.f23915l = eVar;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> n(wu.b0 b0Var) {
            if (b0Var != null) {
                this.f23914k = b0Var;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> o(g1 g1Var) {
            if (g1Var != null) {
                this.f23905a = g1Var;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> p(ht.h hVar) {
            if (hVar != null) {
                this.f23921s = hVar;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> q(b.a aVar) {
            if (aVar != null) {
                this.f = aVar;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // gt.u.a
        public final u.a<gt.u> r() {
            this.f23917n = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b.a aVar, gt.j jVar, gt.u uVar, gt.q0 q0Var, ht.h hVar, fu.e eVar) {
        super(jVar, hVar, eVar, q0Var);
        if (jVar != null) {
            if (hVar != null) {
                if (eVar != null) {
                    if (aVar != null) {
                        if (q0Var != null) {
                            this.F = gt.p.f16807i;
                            this.G = false;
                            this.H = false;
                            this.I = false;
                            this.J = false;
                            this.K = false;
                            this.L = false;
                            this.M = false;
                            this.N = false;
                            this.O = false;
                            this.P = false;
                            this.Q = true;
                            this.R = false;
                            this.S = null;
                            this.T = null;
                            this.W = null;
                            this.X = null;
                            this.U = uVar == null ? this : uVar;
                            this.V = aVar;
                            return;
                        }
                        I(4);
                        throw null;
                    }
                    I(3);
                    throw null;
                }
                I(2);
                throw null;
            }
            I(1);
            throw null;
        }
        I(0);
        throw null;
    }

    public static /* synthetic */ void I(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i10 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i6) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static ArrayList O0(gt.u uVar, List list, j1 j1Var, boolean z10, boolean z11, boolean[] zArr) {
        wu.b0 k10;
        w wVar;
        z0 z0Var;
        gt.q0 source;
        v0 aVar;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z0 z0Var2 = (z0) it.next();
                wu.b0 a10 = z0Var2.a();
                n1 n1Var = n1.IN_VARIANCE;
                wu.b0 k11 = j1Var.k(a10, n1Var);
                wu.b0 j02 = z0Var2.j0();
                if (j02 == null) {
                    k10 = null;
                } else {
                    k10 = j1Var.k(j02, n1Var);
                }
                if (k11 == null) {
                    return null;
                }
                if ((k11 != z0Var2.a() || j02 != k10) && zArr != null) {
                    zArr[0] = true;
                }
                if (z0Var2 instanceof v0.a) {
                    wVar = new w((List) ((v0.a) z0Var2).F.getValue());
                } else {
                    wVar = null;
                }
                if (z10) {
                    z0Var = null;
                } else {
                    z0Var = z0Var2;
                }
                int index = z0Var2.getIndex();
                ht.h annotations = z0Var2.getAnnotations();
                fu.e name = z0Var2.getName();
                boolean v02 = z0Var2.v0();
                boolean b02 = z0Var2.b0();
                boolean Y = z0Var2.Y();
                if (z11) {
                    source = z0Var2.g();
                } else {
                    source = gt.q0.f16815a;
                }
                kotlin.jvm.internal.i.g(annotations, "annotations");
                kotlin.jvm.internal.i.g(name, "name");
                kotlin.jvm.internal.i.g(source, "source");
                if (wVar == null) {
                    aVar = new v0(uVar, z0Var, index, annotations, name, k11, v02, b02, Y, k10, source);
                } else {
                    aVar = new v0.a(uVar, z0Var, index, annotations, name, k11, v02, b02, Y, k10, source, wVar);
                }
                arrayList.add(aVar);
            }
            return arrayList;
        }
        I(30);
        throw null;
    }

    @Override // gt.a
    public boolean E() {
        return this.R;
    }

    public <R, D> R F(gt.l<R, D> lVar, D d10) {
        return lVar.g(this, d10);
    }

    @Override // gt.u
    public final boolean F0() {
        return this.O;
    }

    @Override // gt.y
    public final boolean H0() {
        return this.M;
    }

    @Override // gt.b
    /* renamed from: I0 */
    public gt.u d0(gt.j jVar, gt.z zVar, gt.o oVar) {
        gt.u build = s().a(jVar).d(zVar).k(oVar).q(b.a.FAKE_OVERRIDE).i().build();
        if (build != null) {
            return build;
        }
        I(26);
        throw null;
    }

    @Override // gt.y
    public final boolean M() {
        return this.L;
    }

    public abstract x M0(b.a aVar, gt.j jVar, gt.u uVar, gt.q0 q0Var, ht.h hVar, fu.e eVar);

    public x N0(a aVar) {
        ht.h annotations;
        gt.q0 q0Var;
        o0 o0Var;
        d dVar;
        wu.b0 k10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        gt.u b10;
        if (aVar != null) {
            boolean[] zArr = new boolean[1];
            if (aVar.f23921s != null) {
                annotations = ca.a.B(getAnnotations(), aVar.f23921s);
            } else {
                annotations = getAnnotations();
            }
            ht.h hVar = annotations;
            gt.j jVar = aVar.f23906b;
            gt.u uVar = aVar.f23909e;
            b.a aVar2 = aVar.f;
            fu.e eVar = aVar.f23915l;
            if (aVar.f23918o) {
                if (uVar != null) {
                    b10 = uVar;
                } else {
                    b10 = b();
                }
                q0Var = b10.g();
            } else {
                q0Var = gt.q0.f16815a;
            }
            gt.q0 q0Var2 = q0Var;
            if (q0Var2 != null) {
                x M0 = M0(aVar2, jVar, uVar, q0Var2, hVar, eVar);
                List<gt.v0> list = aVar.r;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                j1 r12 = ca.a.r1(list, aVar.f23905a, M0, arrayList, zArr);
                if (r12 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                boolean isEmpty = aVar.f23911h.isEmpty();
                n1 n1Var = n1.IN_VARIANCE;
                if (!isEmpty) {
                    for (gt.n0 n0Var : aVar.f23911h) {
                        wu.b0 k11 = r12.k(n0Var.a(), n1Var);
                        if (k11 == null) {
                            return null;
                        }
                        arrayList2.add(iu.f.b(M0, k11, n0Var.getAnnotations()));
                        boolean z15 = zArr[0];
                        if (k11 != n0Var.a()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zArr[0] = z14 | z15;
                    }
                }
                gt.n0 n0Var2 = aVar.f23912i;
                if (n0Var2 != null) {
                    wu.b0 k12 = r12.k(n0Var2.a(), n1Var);
                    if (k12 == null) {
                        return null;
                    }
                    o0 o0Var2 = new o0(M0, new qu.b(M0, k12, aVar.f23912i.getValue(), 1), aVar.f23912i.getAnnotations());
                    boolean z16 = zArr[0];
                    if (k12 != aVar.f23912i.a()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zArr[0] = z13 | z16;
                    o0Var = o0Var2;
                } else {
                    o0Var = null;
                }
                gt.n0 n0Var3 = aVar.f23913j;
                if (n0Var3 != null) {
                    d d10 = n0Var3.d(r12);
                    if (d10 == null) {
                        return null;
                    }
                    boolean z17 = zArr[0];
                    if (d10 != aVar.f23913j) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zArr[0] = z17 | z12;
                    dVar = d10;
                } else {
                    dVar = null;
                }
                ArrayList O0 = O0(M0, aVar.f23910g, r12, aVar.f23919p, aVar.f23918o, zArr);
                if (O0 == null || (k10 = r12.k(aVar.f23914k, n1.OUT_VARIANCE)) == null) {
                    return null;
                }
                boolean z18 = zArr[0];
                if (k10 != aVar.f23914k) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z19 = z18 | z10;
                zArr[0] = z19;
                if (!z19 && aVar.f23925w) {
                    return this;
                }
                M0.P0(o0Var, dVar, arrayList2, arrayList, O0, k10, aVar.f23907c, aVar.f23908d);
                M0.G = this.G;
                M0.H = this.H;
                M0.I = this.I;
                M0.J = this.J;
                M0.K = this.K;
                M0.P = this.P;
                M0.L = this.L;
                M0.M = this.M;
                M0.S0(this.Q);
                M0.N = aVar.f23920q;
                M0.O = aVar.f23922t;
                Boolean bool = aVar.f23924v;
                if (bool != null) {
                    z11 = bool.booleanValue();
                } else {
                    z11 = this.R;
                }
                M0.T0(z11);
                if (!aVar.f23923u.isEmpty() || this.X != null) {
                    LinkedHashMap linkedHashMap = aVar.f23923u;
                    Map<a.InterfaceC0261a<?>, Object> map = this.X;
                    if (map != null) {
                        for (Map.Entry<a.InterfaceC0261a<?>, Object> entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        M0.X = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        M0.X = linkedHashMap;
                    }
                }
                if (aVar.f23917n || this.W != null) {
                    gt.u uVar2 = this.W;
                    if (uVar2 == null) {
                        uVar2 = this;
                    }
                    M0.W = uVar2.d(r12);
                }
                if (aVar.f23916m && !b().f().isEmpty()) {
                    if (aVar.f23905a.e()) {
                        ss.a<Collection<gt.u>> aVar3 = this.T;
                        if (aVar3 != null) {
                            M0.T = aVar3;
                        } else {
                            M0.y0(f());
                        }
                    } else {
                        M0.T = new v(this, r12);
                    }
                }
                return M0;
            }
            I(27);
            throw null;
        }
        I(25);
        throw null;
    }

    public void P0(o0 o0Var, gt.n0 n0Var, List list, List list2, List list3, wu.b0 b0Var, gt.z zVar, gt.q qVar) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (qVar != null) {
                        this.f23903y = is.u.I2(list2);
                        this.f23904z = is.u.I2(list3);
                        this.A = b0Var;
                        this.E = zVar;
                        this.F = qVar;
                        this.C = o0Var;
                        this.D = n0Var;
                        this.B = list;
                        for (int i6 = 0; i6 < list2.size(); i6++) {
                            gt.v0 v0Var = (gt.v0) list2.get(i6);
                            if (v0Var.getIndex() != i6) {
                                throw new IllegalStateException(v0Var + " index is " + v0Var.getIndex() + " but position is " + i6);
                            }
                        }
                        for (int i10 = 0; i10 < list3.size(); i10++) {
                            z0 z0Var = (z0) list3.get(i10);
                            if (z0Var.getIndex() != i10 + 0) {
                                throw new IllegalStateException(z0Var + "index is " + z0Var.getIndex() + " but position is " + i10);
                            }
                        }
                        return;
                    }
                    I(8);
                    throw null;
                }
                I(7);
                throw null;
            }
            I(6);
            throw null;
        }
        I(5);
        throw null;
    }

    public boolean Q() {
        return this.K;
    }

    public final a Q0(j1 j1Var) {
        if (j1Var != null) {
            return new a(this, j1Var.g(), c(), m(), getVisibility(), m0(), i(), r0(), this.C, getReturnType());
        }
        I(24);
        throw null;
    }

    public final <V> void R0(a.InterfaceC0261a<V> interfaceC0261a, Object obj) {
        if (this.X == null) {
            this.X = new LinkedHashMap();
        }
        this.X.put(interfaceC0261a, obj);
    }

    public void S0(boolean z10) {
        this.Q = z10;
    }

    public void T0(boolean z10) {
        this.R = z10;
    }

    public final void U0(wu.i0 i0Var) {
        if (i0Var != null) {
            this.A = i0Var;
        } else {
            I(11);
            throw null;
        }
    }

    @Override // gt.u
    public final gt.u e0() {
        return this.W;
    }

    public Collection<? extends gt.u> f() {
        ss.a<Collection<gt.u>> aVar = this.T;
        if (aVar != null) {
            this.S = aVar.invoke();
            this.T = null;
        }
        Collection<? extends gt.u> collection = this.S;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        I(14);
        throw null;
    }

    @Override // gt.a
    public final gt.n0 f0() {
        return this.D;
    }

    public wu.b0 getReturnType() {
        return this.A;
    }

    @Override // gt.a
    public final List<gt.v0> getTypeParameters() {
        List<gt.v0> list = this.f23903y;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // gt.n, gt.y
    public final gt.q getVisibility() {
        gt.q qVar = this.F;
        if (qVar != null) {
            return qVar;
        }
        I(16);
        throw null;
    }

    @Override // gt.a
    public final List<z0> i() {
        List<z0> list = this.f23904z;
        if (list != null) {
            return list;
        }
        I(19);
        throw null;
    }

    public boolean isExternal() {
        return this.I;
    }

    @Override // gt.u
    public final boolean isInfix() {
        if (this.H) {
            return true;
        }
        for (gt.u uVar : b().f()) {
            if (uVar.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.J;
    }

    @Override // gt.u
    public final boolean isOperator() {
        if (this.G) {
            return true;
        }
        for (gt.u uVar : b().f()) {
            if (uVar.isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // gt.u
    public boolean isSuspend() {
        return this.P;
    }

    @Override // gt.a
    public final gt.n0 k0() {
        return this.C;
    }

    @Override // gt.y
    public final gt.z m() {
        gt.z zVar = this.E;
        if (zVar != null) {
            return zVar;
        }
        I(15);
        throw null;
    }

    @Override // gt.b
    public final b.a m0() {
        b.a aVar = this.V;
        if (aVar != null) {
            return aVar;
        }
        I(21);
        throw null;
    }

    @Override // gt.a
    public final List<gt.n0> r0() {
        List<gt.n0> list = this.B;
        if (list != null) {
            return list;
        }
        I(13);
        throw null;
    }

    public u.a<? extends gt.u> s() {
        return Q0(j1.f37255b);
    }

    @Override // gt.a
    public <V> V v(a.InterfaceC0261a<V> interfaceC0261a) {
        Map<a.InterfaceC0261a<?>, Object> map = this.X;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC0261a);
    }

    @Override // gt.u
    public final boolean x0() {
        return this.N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y0(Collection<? extends gt.b> collection) {
        if (collection != 0) {
            this.S = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((gt.u) it.next()).F0()) {
                    this.O = true;
                    return;
                }
            }
            return;
        }
        I(17);
        throw null;
    }

    @Override // gt.u, gt.s0
    public gt.u d(j1 j1Var) {
        if (j1Var != null) {
            if (j1Var.h()) {
                return this;
            }
            a Q0 = Q0(j1Var);
            Q0.f23909e = b();
            Q0.f23918o = true;
            Q0.f23925w = true;
            return Q0.build();
        }
        I(22);
        throw null;
    }

    @Override // kt.q, kt.p, gt.j
    public gt.u b() {
        gt.u uVar = this.U;
        gt.u b10 = uVar == this ? this : uVar.b();
        if (b10 != null) {
            return b10;
        }
        I(20);
        throw null;
    }
}
