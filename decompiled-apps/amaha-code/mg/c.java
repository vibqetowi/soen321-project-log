package mg;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mixpanel.android.util.RemoteService$ServiceUnavailableException;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.b0;
/* compiled from: HttpService.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25052a;

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(String str, HashMap hashMap, SSLSocketFactory sSLSocketFactory) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        OutputStream outputStream;
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream2;
        b0.t("MixpanelAPI.Message", "Attempting request to " + str);
        HttpURLConnection httpURLConnection2 = null;
        r0 = null;
        r0 = null;
        InputStream inputStream3 = null;
        r0 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        int i6 = 0;
        byte[] bArr = null;
        boolean z10 = false;
        while (i6 < 3 && !z10) {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                if (sSLSocketFactory != null) {
                    try {
                        if (httpURLConnection instanceof HttpsURLConnection) {
                            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                        }
                    } catch (EOFException unused) {
                        inputStream2 = null;
                        outputStream = null;
                        bufferedOutputStream = null;
                        try {
                            b0.l("MixpanelAPI.Message", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
                            i6++;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException unused4) {
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream2;
                            bufferedOutputStream2 = bufferedOutputStream;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        inputStream2 = null;
                        outputStream = null;
                        bufferedOutputStream = null;
                        inputStream3 = inputStream2;
                        inputStream = inputStream3;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                            try {
                                if (httpURLConnection2.getResponseCode() >= 500 && httpURLConnection2.getResponseCode() <= 599) {
                                    throw new RemoteService$ServiceUnavailableException(httpURLConnection2.getHeaderField("Retry-After"));
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                httpURLConnection = httpURLConnection2;
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                }
                                if (outputStream != null) {
                                }
                                if (inputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                throw th;
                            }
                        }
                        throw e;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        outputStream = null;
                        if (bufferedOutputStream2 != null) {
                        }
                        if (outputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                }
                httpURLConnection.setConnectTimeout(2000);
                httpURLConnection.setReadTimeout(30000);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : hashMap.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                httpURLConnection.setFixedLengthStreamingMode(encodedQuery.getBytes().length);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                outputStream = httpURLConnection.getOutputStream();
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                } catch (EOFException unused8) {
                    inputStream2 = null;
                    bufferedOutputStream = null;
                } catch (IOException e11) {
                    e = e11;
                    bufferedOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                }
                try {
                    bufferedOutputStream.write(encodedQuery.getBytes("UTF-8"));
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    outputStream.close();
                    inputStream2 = httpURLConnection.getInputStream();
                    try {
                        bArr = b(inputStream2);
                        inputStream2.close();
                        httpURLConnection.disconnect();
                        z10 = true;
                    } catch (EOFException unused9) {
                        outputStream = null;
                        bufferedOutputStream = null;
                        b0.l("MixpanelAPI.Message", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
                        i6++;
                        if (bufferedOutputStream != null) {
                        }
                        if (outputStream != null) {
                        }
                        if (inputStream2 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                    } catch (IOException e12) {
                        e = e12;
                        outputStream = null;
                        bufferedOutputStream = null;
                        inputStream3 = inputStream2;
                        inputStream = inputStream3;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                        }
                        throw e;
                    } catch (Throwable th6) {
                        th = th6;
                        outputStream = null;
                        inputStream = inputStream2;
                        if (bufferedOutputStream2 != null) {
                        }
                        if (outputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                } catch (EOFException unused10) {
                    inputStream2 = null;
                    b0.l("MixpanelAPI.Message", "Failure to connect, likely caused by a known issue with Android lib. Retrying.");
                    i6++;
                    if (bufferedOutputStream != null) {
                    }
                    if (outputStream != null) {
                    }
                    if (inputStream2 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                } catch (IOException e13) {
                    e = e13;
                    inputStream = inputStream3;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                    }
                    throw e;
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = null;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                    }
                    if (outputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            } catch (EOFException unused11) {
                httpURLConnection = null;
            } catch (IOException e14) {
                e = e14;
                inputStream = null;
                outputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th8) {
                th = th8;
                httpURLConnection = null;
            }
        }
        if (i6 >= 3) {
            b0.t("MixpanelAPI.Message", "Could not connect to Mixpanel service after three retries.");
        }
        return bArr;
    }
}
