package ql;

import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
/* compiled from: MediaData.kt */
/* loaded from: classes2.dex */
public final class o implements Serializable {
    public final String A;
    public final long B;
    public final long C;
    public final long D;
    public final String E;

    /* renamed from: u  reason: collision with root package name */
    public final String f29759u;

    /* renamed from: v  reason: collision with root package name */
    public final String f29760v;

    /* renamed from: w  reason: collision with root package name */
    public final String f29761w;

    /* renamed from: x  reason: collision with root package name */
    public final String f29762x;

    /* renamed from: y  reason: collision with root package name */
    public final String f29763y;

    /* renamed from: z  reason: collision with root package name */
    public final String f29764z;

    public o() {
        this(null, null, null, null, 0L, 0L, 0L, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.i.b(this.f29759u, oVar.f29759u) && kotlin.jvm.internal.i.b(this.f29760v, oVar.f29760v) && kotlin.jvm.internal.i.b(this.f29761w, oVar.f29761w) && kotlin.jvm.internal.i.b(this.f29762x, oVar.f29762x) && kotlin.jvm.internal.i.b(this.f29763y, oVar.f29763y) && kotlin.jvm.internal.i.b(this.f29764z, oVar.f29764z) && kotlin.jvm.internal.i.b(this.A, oVar.A) && this.B == oVar.B && this.C == oVar.C && this.D == oVar.D && kotlin.jvm.internal.i.b(this.E, oVar.E)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c10 = pl.a.c(this.A, pl.a.c(this.f29764z, pl.a.c(this.f29763y, pl.a.c(this.f29762x, pl.a.c(this.f29761w, pl.a.c(this.f29760v, this.f29759u.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        long j10 = this.B;
        long j11 = this.C;
        long j12 = this.D;
        return this.E.hashCode() + ((((((c10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaData(id=");
        sb2.append(this.f29759u);
        sb2.append(", title=");
        sb2.append(this.f29760v);
        sb2.append(", album=");
        sb2.append(this.f29761w);
        sb2.append(", artist=");
        sb2.append(this.f29762x);
        sb2.append(", genre=");
        sb2.append(this.f29763y);
        sb2.append(", source=");
        sb2.append(this.f29764z);
        sb2.append(", image=");
        sb2.append(this.A);
        sb2.append(", trackNumber=");
        sb2.append(this.B);
        sb2.append(", totalTrackCount=");
        sb2.append(this.C);
        sb2.append(", duration=");
        sb2.append(this.D);
        sb2.append(", site=");
        return v.g.c(sb2, this.E, ')');
    }

    public o(String str, String str2, String str3, String str4, long j10, long j11, long j12, int i6) {
        String id2 = (i6 & 1) != 0 ? "" : str;
        String title = (i6 & 2) != 0 ? "" : str2;
        String album = (i6 & 4) != 0 ? "" : null;
        String artist = (i6 & 8) != 0 ? "" : null;
        String genre = (i6 & 16) != 0 ? "" : null;
        String source = (i6 & 32) != 0 ? "" : str3;
        String image = (i6 & 64) != 0 ? "" : str4;
        long j13 = (i6 & 128) != 0 ? 0L : j10;
        long j14 = (i6 & 256) == 0 ? j11 : 0L;
        long j15 = (i6 & 512) != 0 ? -1L : j12;
        String site = (i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 0 ? null : "";
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(title, "title");
        kotlin.jvm.internal.i.g(album, "album");
        kotlin.jvm.internal.i.g(artist, "artist");
        kotlin.jvm.internal.i.g(genre, "genre");
        kotlin.jvm.internal.i.g(source, "source");
        kotlin.jvm.internal.i.g(image, "image");
        kotlin.jvm.internal.i.g(site, "site");
        this.f29759u = id2;
        this.f29760v = title;
        this.f29761w = album;
        this.f29762x = artist;
        this.f29763y = genre;
        this.f29764z = source;
        this.A = image;
        this.B = j13;
        this.C = j14;
        this.D = j15;
        this.E = site;
    }
}
