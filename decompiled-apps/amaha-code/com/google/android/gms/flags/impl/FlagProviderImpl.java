package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import c4.t;
import com.google.android.gms.common.util.DynamiteApi;
import da.a;
import fa.b;
import na.c;
@DynamiteApi
/* loaded from: classes.dex */
public class FlagProviderImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7466a = false;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f7467b;

    @Override // fa.a
    public boolean getBooleanFlagValue(String str, boolean z10, int i6) {
        String str2;
        if (!this.f7466a) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.f7467b;
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            valueOf = (Boolean) c.a(new t(4, sharedPreferences, str, valueOf));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.booleanValue();
    }

    @Override // fa.a
    public int getIntFlagValue(String str, int i6, int i10) {
        String str2;
        if (!this.f7466a) {
            return i6;
        }
        SharedPreferences sharedPreferences = this.f7467b;
        Integer valueOf = Integer.valueOf(i6);
        try {
            valueOf = (Integer) c.a(new t(5, sharedPreferences, str, valueOf));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.intValue();
    }

    @Override // fa.a
    public long getLongFlagValue(String str, long j10, int i6) {
        String str2;
        if (!this.f7466a) {
            return j10;
        }
        SharedPreferences sharedPreferences = this.f7467b;
        Long valueOf = Long.valueOf(j10);
        try {
            valueOf = (Long) c.a(new t(6, sharedPreferences, str, valueOf));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
        }
        return valueOf.longValue();
    }

    @Override // fa.a
    public String getStringFlagValue(String str, String str2, int i6) {
        String str3;
        if (!this.f7466a) {
            return str2;
        }
        try {
            return (String) c.a(new t(7, this.f7467b, str, str2));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            if (valueOf.length() != 0) {
                str3 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str3 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str3);
            return str2;
        }
    }

    @Override // fa.a
    public void init(a aVar) {
        String str;
        Context context = (Context) da.b.Y1(aVar);
        if (this.f7466a) {
            return;
        }
        try {
            this.f7467b = ga.a.a(context.createPackageContext("com.google.android.gms", 0));
            this.f7466a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            if (valueOf.length() != 0) {
                str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
            } else {
                str = new String("Could not retrieve sdk flags, continuing with defaults: ");
            }
            Log.w("FlagProviderImpl", str);
        }
    }
}
