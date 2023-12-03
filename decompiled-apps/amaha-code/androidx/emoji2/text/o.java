package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final d1.b f2082a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f2083b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2084c = new a(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f2085d;

    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f2086a;

        /* renamed from: b  reason: collision with root package name */
        public i f2087b;

        public a() {
            this(1);
        }

        public final void a(i iVar, int i6, int i10) {
            a aVar;
            int a10 = iVar.a(i6);
            SparseArray<a> sparseArray = this.f2086a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(iVar.a(i6), aVar);
            }
            if (i10 > i6) {
                aVar.a(iVar, i6 + 1, i10);
            } else {
                aVar.f2087b = iVar;
            }
        }

        public a(int i6) {
            this.f2086a = new SparseArray<>(i6);
        }
    }

    public o(Typeface typeface, d1.b bVar) {
        int i6;
        int i10;
        int i11;
        boolean z10;
        this.f2085d = typeface;
        this.f2082a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i12 = a10 + bVar.f12129a;
            i6 = bVar.f12130b.getInt(bVar.f12130b.getInt(i12) + i12);
        } else {
            i6 = 0;
        }
        this.f2083b = new char[i6 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i13 = a11 + bVar.f12129a;
            i10 = bVar.f12130b.getInt(bVar.f12130b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            i iVar = new i(this, i14);
            d1.a c10 = iVar.c();
            int a12 = c10.a(4);
            if (a12 != 0) {
                i11 = c10.f12130b.getInt(a12 + c10.f12129a);
            } else {
                i11 = 0;
            }
            Character.toChars(i11, this.f2083b, i14 * 2);
            if (iVar.b() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kc.f.m("invalid metadata codepoint length", z10);
            this.f2084c.a(iVar, 0, iVar.b() - 1);
        }
    }
}
