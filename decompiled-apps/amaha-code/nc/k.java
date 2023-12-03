package nc;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nc.b;
/* compiled from: Splitter.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final nc.b f26002a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26003b;

    /* renamed from: c  reason: collision with root package name */
    public final b f26004c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26005d;

    /* compiled from: Splitter.java */
    /* loaded from: classes.dex */
    public static abstract class a extends nc.a<String> {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public final CharSequence f26006w;

        /* renamed from: x  reason: collision with root package name */
        public final nc.b f26007x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f26008y;

        /* renamed from: z  reason: collision with root package name */
        public int f26009z = 0;

        public a(k kVar, CharSequence charSequence) {
            this.f26007x = kVar.f26002a;
            this.f26008y = kVar.f26003b;
            this.A = kVar.f26005d;
            this.f26006w = charSequence;
        }
    }

    /* compiled from: Splitter.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public k(b bVar, boolean z10, b.c cVar, int i6) {
        this.f26004c = bVar;
        this.f26003b = z10;
        this.f26002a = cVar;
        this.f26005d = i6;
    }

    public static k a(char c10) {
        return new k(new j(new b.C0427b(c10)), false, b.d.f25983v, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public final List<String> b(CharSequence charSequence) {
        charSequence.getClass();
        j jVar = (j) this.f26004c;
        jVar.getClass();
        i iVar = new i(jVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add(iVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
