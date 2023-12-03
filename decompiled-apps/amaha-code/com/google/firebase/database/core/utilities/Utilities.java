package com.google.firebase.database.core.utilities;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.RepoInfo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import ya.h;
import ya.i;
/* loaded from: classes.dex */
public class Utilities {
    private static final char[] HEX_CHARACTERS = "0123456789abcdef".toCharArray();

    /* JADX WARN: Multi-variable type inference failed */
    public static <C> C castOrNull(Object obj, Class<C> cls) {
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        return null;
    }

    public static int compareInts(int i6, int i10) {
        if (i6 < i10) {
            return -1;
        }
        if (i6 == i10) {
            return 0;
        }
        return 1;
    }

    public static int compareLongs(long j10, long j11) {
        int i6 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i6 < 0) {
            return -1;
        }
        if (i6 == 0) {
            return 0;
        }
        return 1;
    }

    public static String doubleToHashString(double d10) {
        StringBuilder sb2 = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d10);
        for (int i6 = 7; i6 >= 0; i6--) {
            int i10 = (int) ((doubleToLongBits >>> (i6 * 8)) & 255);
            char[] cArr = HEX_CHARACTERS;
            sb2.append(cArr[(i10 >> 4) & 15]);
            sb2.append(cArr[i10 & 15]);
        }
        return sb2.toString();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    private static String extractPathString(String str) {
        int indexOf = str.indexOf("//");
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 != -1) {
                int indexOf3 = substring.indexOf("?");
                if (indexOf3 != -1) {
                    return substring.substring(indexOf2 + 1, indexOf3);
                }
                return substring.substring(indexOf2 + 1);
            }
            return "";
        }
        throw new DatabaseException("Firebase Database URL is missing URL scheme");
    }

    public static <C> C getOrNull(Object obj, String str, Class<C> cls) {
        Object obj2;
        if (obj == null || (obj2 = ((Map) castOrNull(obj, Map.class)).get(str)) == null) {
            return null;
        }
        return (C) castOrNull(obj2, cls);
    }

    public static void hardAssert(boolean z10) {
        hardAssert(z10, "");
    }

    public static ParsedUrl parseUrl(String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                String host = parse.getHost();
                if (host != null) {
                    String queryParameter = parse.getQueryParameter("ns");
                    boolean z10 = false;
                    if (queryParameter == null) {
                        queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
                    }
                    RepoInfo repoInfo = new RepoInfo();
                    repoInfo.host = host.toLowerCase(Locale.US);
                    int port = parse.getPort();
                    if (port != -1) {
                        repoInfo.secure = (scheme.equals("https") || scheme.equals("wss")) ? true : true;
                        repoInfo.host += ":" + port;
                    } else {
                        repoInfo.secure = true;
                    }
                    repoInfo.internalHost = repoInfo.host;
                    repoInfo.namespace = queryParameter;
                    String replace = extractPathString(str).replace("+", " ");
                    Validation.validateRootPathString(replace);
                    ParsedUrl parsedUrl = new ParsedUrl();
                    parsedUrl.path = new Path(replace);
                    parsedUrl.repoInfo = repoInfo;
                    return parsedUrl;
                }
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
        } catch (Exception e10) {
            throw new DatabaseException(c.r("Invalid Firebase Database url specified: ", str), e10);
        }
    }

    public static String sha1HexDigest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e10);
        }
    }

    public static String stringHashV2Representation(String str) {
        String str2;
        if (str.indexOf(92) != -1) {
            str2 = str.replace("\\", "\\\\");
        } else {
            str2 = str;
        }
        if (str.indexOf(34) != -1) {
            str2 = str2.replace("\"", "\\\"");
        }
        return "\"" + str2 + '\"';
    }

    public static Integer tryParseInt(String str) {
        boolean z10;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i6 = 0;
        if (str.charAt(0) == '-') {
            z10 = true;
            if (str.length() == 1) {
                return null;
            }
            i6 = 1;
        } else {
            z10 = false;
        }
        long j10 = 0;
        while (i6 < str.length()) {
            char charAt = str.charAt(i6);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j10 = (j10 * 10) + (charAt - '0');
            i6++;
        }
        if (z10) {
            long j11 = -j10;
            if (j11 < -2147483648L) {
                return null;
            }
            return Integer.valueOf((int) j11);
        } else if (j10 > 2147483647L) {
            return null;
        } else {
            return Integer.valueOf((int) j10);
        }
    }

    public static Pair<h<Void>, DatabaseReference.CompletionListener> wrapOnComplete(DatabaseReference.CompletionListener completionListener) {
        if (completionListener == null) {
            final i iVar = new i();
            return new Pair<>(iVar.f38392a, new DatabaseReference.CompletionListener() { // from class: com.google.firebase.database.core.utilities.Utilities.1
                @Override // com.google.firebase.database.DatabaseReference.CompletionListener
                public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                    if (databaseError != null) {
                        i.this.a(databaseError.toException());
                    } else {
                        i.this.b(null);
                    }
                }
            });
        }
        return new Pair<>(null, completionListener);
    }

    public static void hardAssert(boolean z10, String str) {
        if (z10) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }
}
