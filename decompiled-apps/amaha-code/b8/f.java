package b8;

import android.util.Log;
import c9.q;
/* compiled from: MetadataUtil.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4033a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static l8.e a(int i6, q qVar) {
        String str;
        int c10 = qVar.c();
        if (qVar.c() == 1684108385) {
            qVar.B(8);
            String l2 = qVar.l(c10 - 16);
            return new l8.e("und", l2, l2);
        }
        String valueOf = String.valueOf(a.a(i6));
        if (valueOf.length() != 0) {
            str = "Failed to parse comment attribute: ".concat(valueOf);
        } else {
            str = new String("Failed to parse comment attribute: ");
        }
        Log.w("MetadataUtil", str);
        return null;
    }

    public static l8.a b(q qVar) {
        String str;
        int c10 = qVar.c();
        if (qVar.c() == 1684108385) {
            int c11 = qVar.c() & 16777215;
            if (c11 == 13) {
                str = "image/jpeg";
            } else if (c11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                defpackage.d.k(41, "Unrecognized cover art flags: ", c11, "MetadataUtil");
                return null;
            }
            qVar.B(4);
            int i6 = c10 - 16;
            byte[] bArr = new byte[i6];
            qVar.b(0, bArr, i6);
            return new l8.a(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static l8.l c(int i6, q qVar, String str) {
        String str2;
        int c10 = qVar.c();
        if (qVar.c() == 1684108385 && c10 >= 22) {
            qVar.B(10);
            int v10 = qVar.v();
            if (v10 > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(v10);
                String sb3 = sb2.toString();
                int v11 = qVar.v();
                if (v11 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(v11);
                    sb3 = sb4.toString();
                }
                return new l8.l(str, null, sb3);
            }
        }
        String valueOf2 = String.valueOf(a.a(i6));
        if (valueOf2.length() != 0) {
            str2 = "Failed to parse index/count attribute: ".concat(valueOf2);
        } else {
            str2 = new String("Failed to parse index/count attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    public static l8.l d(int i6, q qVar, String str) {
        String str2;
        int c10 = qVar.c();
        if (qVar.c() == 1684108385) {
            qVar.B(8);
            return new l8.l(str, null, qVar.l(c10 - 16));
        }
        String valueOf = String.valueOf(a.a(i6));
        if (valueOf.length() != 0) {
            str2 = "Failed to parse text attribute: ".concat(valueOf);
        } else {
            str2 = new String("Failed to parse text attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    public static l8.h e(int i6, String str, q qVar, boolean z10, boolean z11) {
        String str2;
        int f = f(qVar);
        if (z11) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            if (z10) {
                return new l8.l(str, null, Integer.toString(f));
            }
            return new l8.e("und", str, Integer.toString(f));
        }
        String valueOf = String.valueOf(a.a(i6));
        if (valueOf.length() != 0) {
            str2 = "Failed to parse uint8 attribute: ".concat(valueOf);
        } else {
            str2 = new String("Failed to parse uint8 attribute: ");
        }
        Log.w("MetadataUtil", str2);
        return null;
    }

    public static int f(q qVar) {
        qVar.B(4);
        if (qVar.c() == 1684108385) {
            qVar.B(8);
            return qVar.q();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
