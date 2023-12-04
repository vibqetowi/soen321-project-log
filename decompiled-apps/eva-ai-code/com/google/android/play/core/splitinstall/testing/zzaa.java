package com.google.android.play.core.splitinstall.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzaa {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("LocalTestingConfigParser");
    private final XmlPullParser zzb;
    private final zzu zzc = zzv.zzc();

    zzaa(XmlPullParser xmlPullParser) {
        this.zzb = xmlPullParser;
    }

    public static zzv zza(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return zzv.zza;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                final zzaa zzaaVar = new zzaa(newPullParser);
                zzaaVar.zze("local-testing-config", new zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzy
                    @Override // com.google.android.play.core.splitinstall.testing.zzz
                    public final void zza() {
                        zzaa.this.zzd();
                    }
                });
                zzv zze = zzaaVar.zzc.zze();
                fileReader.close();
                return zze;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            zza.zze("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return zzv.zza;
        }
    }

    public static /* synthetic */ void zzb(final zzaa zzaaVar) {
        for (int i = 0; i < zzaaVar.zzb.getAttributeCount(); i++) {
            if ("defaultErrorCode".equals(zzaaVar.zzb.getAttributeName(i))) {
                zzaaVar.zzc.zza(com.google.android.play.core.splitinstall.model.zza.zza(zzaaVar.zzb.getAttributeValue(i)));
            }
        }
        zzaaVar.zze("split-install-error", new zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzw
            @Override // com.google.android.play.core.splitinstall.testing.zzz
            public final void zza() {
                zzaa.zzc(zzaa.this);
            }
        });
    }

    public static /* synthetic */ void zzc(zzaa zzaaVar) {
        String str = null;
        String str2 = null;
        for (int i = 0; i < zzaaVar.zzb.getAttributeCount(); i++) {
            if ("module".equals(zzaaVar.zzb.getAttributeName(i))) {
                str = zzaaVar.zzb.getAttributeValue(i);
            }
            if ("errorCode".equals(zzaaVar.zzb.getAttributeName(i))) {
                str2 = zzaaVar.zzb.getAttributeValue(i);
            }
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), zzaaVar.zzb, null);
        }
        zzaaVar.zzc.zzd().put(str, Integer.valueOf(com.google.android.play.core.splitinstall.model.zza.zza(str2)));
        do {
        } while (zzaaVar.zzb.next() != 3);
    }

    private final void zze(String str, zzz zzzVar) throws IOException, XmlPullParserException {
        while (true) {
            int next = this.zzb.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.zzb.getEventType() == 2) {
                if (this.zzb.getName().equals(str)) {
                    zzzVar.zza();
                } else {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.zzb.getName()), this.zzb, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() throws IOException, XmlPullParserException {
        zze("split-install-errors", new zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzx
            @Override // com.google.android.play.core.splitinstall.testing.zzz
            public final void zza() {
                zzaa.zzb(zzaa.this);
            }
        });
    }
}
