package is;

import com.appsflyer.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: SlidingWindow.kt */
@ns.e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle, R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlNormal, R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends ns.h implements ss.p<fv.j<? super List<Object>>, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Iterator<Object> C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;

    /* renamed from: v  reason: collision with root package name */
    public Object f20664v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator f20665w;

    /* renamed from: x  reason: collision with root package name */
    public int f20666x;

    /* renamed from: y  reason: collision with root package name */
    public int f20667y;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ Object f20668z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i6, int i10, Iterator<Object> it, boolean z10, boolean z11, ls.d<? super i0> dVar) {
        super(dVar);
        this.A = i6;
        this.B = i10;
        this.C = it;
        this.D = z10;
        this.E = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        i0 i0Var = new i0(this.A, this.B, this.C, this.D, this.E, dVar);
        i0Var.f20668z = obj;
        return i0Var;
    }

    @Override // ss.p
    public final Object invoke(fv.j<? super List<Object>> jVar, ls.d<? super hs.k> dVar) {
        return ((i0) create(jVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0193  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a1 -> B:33:0x00a4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0113 -> B:79:0x015e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0137 -> B:79:0x015e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0156 -> B:78:0x0159). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x018a -> B:94:0x018d). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
