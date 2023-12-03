package hu;

import gt.z0;
import hu.b;
import hu.c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.y;
import wu.b0;
/* compiled from: DescriptorRendererOptionsImpl.kt */
/* loaded from: classes2.dex */
public final class k implements j {
    public static final /* synthetic */ ys.m<Object>[] W = {y.b(new kotlin.jvm.internal.m(y.a(k.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "withDefinedIn", "getWithDefinedIn()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "modifiers", "getModifiers()Ljava/util/Set;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "startFromName", "getStartFromName()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "debugMode", "getDebugMode()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "verbose", "getVerbose()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "unitReturnType", "getUnitReturnType()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "withoutReturnType", "getWithoutReturnType()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "enhancedTypes", "getEnhancedTypes()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderDefaultModality", "getRenderDefaultModality()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "receiverAfterName", "getReceiverAfterName()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), y.b(new kotlin.jvm.internal.m(y.a(k.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    public final l A;
    public final l B;
    public final l C;
    public final l D;
    public final l E;
    public final l F;
    public final l G;
    public final l H;
    public final l I;
    public final l J;
    public final l K;
    public final l L;
    public final l M;
    public final l N;
    public final l O;
    public final l P;
    public final l Q;
    public final l R;
    public final l S;
    public final l T;
    public final l U;
    public final l V;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19557a;

    /* renamed from: b  reason: collision with root package name */
    public final l f19558b = new l(b.c.f19527a, this);

    /* renamed from: c  reason: collision with root package name */
    public final l f19559c;

    /* renamed from: d  reason: collision with root package name */
    public final l f19560d;

    /* renamed from: e  reason: collision with root package name */
    public final l f19561e;
    public final l f;

    /* renamed from: g  reason: collision with root package name */
    public final l f19562g;

    /* renamed from: h  reason: collision with root package name */
    public final l f19563h;

    /* renamed from: i  reason: collision with root package name */
    public final l f19564i;

    /* renamed from: j  reason: collision with root package name */
    public final l f19565j;

    /* renamed from: k  reason: collision with root package name */
    public final l f19566k;

    /* renamed from: l  reason: collision with root package name */
    public final l f19567l;

    /* renamed from: m  reason: collision with root package name */
    public final l f19568m;

    /* renamed from: n  reason: collision with root package name */
    public final l f19569n;

    /* renamed from: o  reason: collision with root package name */
    public final l f19570o;

    /* renamed from: p  reason: collision with root package name */
    public final l f19571p;

    /* renamed from: q  reason: collision with root package name */
    public final l f19572q;
    public final l r;

    /* renamed from: s  reason: collision with root package name */
    public final l f19573s;

    /* renamed from: t  reason: collision with root package name */
    public final l f19574t;

    /* renamed from: u  reason: collision with root package name */
    public final l f19575u;

    /* renamed from: v  reason: collision with root package name */
    public final l f19576v;

    /* renamed from: w  reason: collision with root package name */
    public final l f19577w;

    /* renamed from: x  reason: collision with root package name */
    public final l f19578x;

    /* renamed from: y  reason: collision with root package name */
    public final l f19579y;

    /* renamed from: z  reason: collision with root package name */
    public final l f19580z;

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<z0, String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f19581u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final String invoke(z0 z0Var) {
            z0 it = z0Var;
            kotlin.jvm.internal.i.g(it, "it");
            return "...";
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<b0, b0> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f19582u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final b0 invoke(b0 b0Var) {
            b0 it = b0Var;
            kotlin.jvm.internal.i.g(it, "it");
            return it;
        }
    }

    public k() {
        Boolean bool = Boolean.TRUE;
        this.f19559c = new l(bool, this);
        this.f19560d = new l(bool, this);
        this.f19561e = new l(i.f19551v, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new l(bool2, this);
        this.f19562g = new l(bool2, this);
        this.f19563h = new l(bool2, this);
        this.f19564i = new l(bool2, this);
        this.f19565j = new l(bool2, this);
        this.f19566k = new l(bool, this);
        this.f19567l = new l(bool2, this);
        this.f19568m = new l(bool2, this);
        this.f19569n = new l(bool2, this);
        this.f19570o = new l(bool, this);
        this.f19571p = new l(bool, this);
        this.f19572q = new l(bool2, this);
        this.r = new l(bool2, this);
        this.f19573s = new l(bool2, this);
        this.f19574t = new l(bool2, this);
        this.f19575u = new l(bool2, this);
        this.f19576v = new l(bool2, this);
        this.f19577w = new l(bool2, this);
        this.f19578x = new l(b.f19582u, this);
        this.f19579y = new l(a.f19581u, this);
        this.f19580z = new l(bool, this);
        this.A = new l(o.RENDER_OPEN, this);
        this.B = new l(c.l.a.f19540a, this);
        this.C = new l(r.f19596u, this);
        this.D = new l(p.ALL, this);
        this.E = new l(bool2, this);
        this.F = new l(bool2, this);
        this.G = new l(q.DEBUG, this);
        this.H = new l(bool2, this);
        this.I = new l(bool2, this);
        this.J = new l(is.y.f20678u, this);
        this.K = new l(m.f19584a, this);
        this.L = new l(null, this);
        this.M = new l(hu.a.NO_ARGUMENTS, this);
        this.N = new l(bool2, this);
        this.O = new l(bool, this);
        this.P = new l(bool, this);
        this.Q = new l(bool2, this);
        this.R = new l(bool, this);
        this.S = new l(bool, this);
        this.T = new l(bool2, this);
        this.U = new l(bool2, this);
        this.V = new l(bool, this);
    }

    @Override // hu.j
    public final void a() {
        ys.m<Object> mVar = W[29];
        this.E.c(Boolean.TRUE, mVar);
    }

    @Override // hu.j
    public final void b() {
        ys.m<Object> mVar = W[6];
        this.f19563h.c(Boolean.TRUE, mVar);
    }

    @Override // hu.j
    public final void c() {
        ys.m<Object> mVar = W[30];
        this.F.c(Boolean.TRUE, mVar);
    }

    @Override // hu.j
    public final void d(Set<? extends i> set) {
        kotlin.jvm.internal.i.g(set, "<set-?>");
        this.f19561e.c(set, W[3]);
    }

    @Override // hu.j
    public final boolean e() {
        return ((Boolean) this.f19568m.b(W[11])).booleanValue();
    }

    @Override // hu.j
    public final void f(LinkedHashSet linkedHashSet) {
        this.K.c(linkedHashSet, W[35]);
    }

    @Override // hu.j
    public final void g() {
        ys.m<Object> mVar = W[20];
        this.f19576v.c(Boolean.TRUE, mVar);
    }

    @Override // hu.j
    public final void h(hu.b bVar) {
        this.f19558b.c(bVar, W[0]);
    }

    @Override // hu.j
    public final void i(p pVar) {
        this.D.c(pVar, W[28]);
    }

    @Override // hu.j
    public final void j() {
        ys.m<Object> mVar = W[4];
        this.f.c(Boolean.TRUE, mVar);
    }

    @Override // hu.j
    public final void k() {
        ys.m<Object> mVar = W[1];
        this.f19559c.c(Boolean.FALSE, mVar);
    }

    @Override // hu.j
    public final Set<fu.c> l() {
        return (Set) this.K.b(W[35]);
    }

    @Override // hu.j
    public final boolean m() {
        return ((Boolean) this.f19563h.b(W[6])).booleanValue();
    }

    @Override // hu.j
    public final void n() {
        this.C.c(r.f19597v, W[27]);
    }

    @Override // hu.j
    public final void o() {
        ys.m<Object> mVar = W[21];
        this.f19577w.c(Boolean.TRUE, mVar);
    }

    public final hu.a p() {
        return (hu.a) this.M.b(W[37]);
    }
}
