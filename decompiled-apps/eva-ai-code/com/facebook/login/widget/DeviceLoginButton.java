package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DeviceLoginManager;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;
/* loaded from: classes2.dex */
public class DeviceLoginButton extends LoginButton {
    private Uri deviceRedirectUri;

    public DeviceLoginButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public DeviceLoginButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DeviceLoginButton(Context context) {
        super(context);
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.deviceRedirectUri = uri;
    }

    public Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    @Override // com.facebook.login.widget.LoginButton
    protected LoginButton.LoginClickListener getNewLoginClickListener() {
        return new DeviceLoginClickListener();
    }

    /* loaded from: classes2.dex */
    private class DeviceLoginClickListener extends LoginButton.LoginClickListener {
        private DeviceLoginClickListener() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.LoginClickListener
        protected LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                DeviceLoginManager deviceLoginManager = DeviceLoginManager.getInstance();
                deviceLoginManager.setDefaultAudience(DeviceLoginButton.this.getDefaultAudience());
                deviceLoginManager.setLoginBehavior(LoginBehavior.DEVICE_AUTH);
                deviceLoginManager.setDeviceRedirectUri(DeviceLoginButton.this.getDeviceRedirectUri());
                return deviceLoginManager;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }
}
