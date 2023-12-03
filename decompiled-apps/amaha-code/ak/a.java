package ak;

import ak.b;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f591u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f592v;

    public /* synthetic */ a(b bVar, int i6) {
        this.f591u = i6;
        this.f592v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f591u;
        b baseDotsIndicator = this.f592v;
        switch (i6) {
            case 0:
                i.g(baseDotsIndicator, "this$0");
                baseDotsIndicator.d();
                return;
            case 1:
                i.g(baseDotsIndicator, "this$0");
                ArrayList<ImageView> arrayList = baseDotsIndicator.f593u;
                int size = arrayList.size();
                b.a aVar = baseDotsIndicator.A;
                i.d(aVar);
                int i10 = 0;
                if (size < aVar.getCount()) {
                    b.a aVar2 = baseDotsIndicator.A;
                    i.d(aVar2);
                    int count = aVar2.getCount() - arrayList.size();
                    while (i10 < count) {
                        baseDotsIndicator.a(i10);
                        i10++;
                    }
                } else {
                    int size2 = arrayList.size();
                    b.a aVar3 = baseDotsIndicator.A;
                    i.d(aVar3);
                    if (size2 > aVar3.getCount()) {
                        int size3 = arrayList.size();
                        b.a aVar4 = baseDotsIndicator.A;
                        i.d(aVar4);
                        int count2 = size3 - aVar4.getCount();
                        while (i10 < count2) {
                            baseDotsIndicator.f();
                            i10++;
                        }
                    }
                }
                baseDotsIndicator.e();
                Iterator<ImageView> it = arrayList.iterator();
                while (it.hasNext()) {
                    sp.b.Y((int) baseDotsIndicator.f596x, it.next());
                }
                b.a aVar5 = baseDotsIndicator.A;
                i.d(aVar5);
                if (aVar5.d()) {
                    b.a aVar6 = baseDotsIndicator.A;
                    i.d(aVar6);
                    aVar6.c();
                    e b10 = baseDotsIndicator.b();
                    b.a aVar7 = baseDotsIndicator.A;
                    i.d(aVar7);
                    aVar7.e(b10);
                    b.a aVar8 = baseDotsIndicator.A;
                    i.d(aVar8);
                    b10.b(0.0f, aVar8.a());
                    return;
                }
                return;
            case 2:
                i.g(baseDotsIndicator, "this$0");
                baseDotsIndicator.d();
                return;
            default:
                i.g(baseDotsIndicator, "$baseDotsIndicator");
                baseDotsIndicator.d();
                return;
        }
    }
}
