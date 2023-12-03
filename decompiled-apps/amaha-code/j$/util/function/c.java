package j$.util.function;

import java.util.function.Function;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function f21214b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function f21215c;

    public /* synthetic */ c(Function function, Function function2, int i6) {
        this.f21213a = i6;
        this.f21214b = function;
        this.f21215c = function2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f21213a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i6 = this.f21213a;
        Function function = this.f21215c;
        Function function2 = this.f21214b;
        switch (i6) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.f21213a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
