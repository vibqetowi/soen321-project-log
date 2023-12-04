package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.subtle.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public final class JsonKeysetWriter implements KeysetWriter {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final OutputStream outputStream;

    private long toUnsignedLong(int x) {
        return x & 4294967295L;
    }

    private JsonKeysetWriter(OutputStream stream) {
        this.outputStream = stream;
    }

    public static KeysetWriter withOutputStream(OutputStream stream) {
        return new JsonKeysetWriter(stream);
    }

    public static KeysetWriter withFile(File file) throws IOException {
        return new JsonKeysetWriter(new FileOutputStream(file));
    }

    public static KeysetWriter withPath(String path) throws IOException {
        return withFile(new File(path));
    }

    public static KeysetWriter withPath(Path path) throws IOException {
        File file;
        file = path.toFile();
        return withFile(file);
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                String jSONObject = toJson(keyset).toString(4);
                Charset charset = UTF_8;
                outputStream.write(jSONObject.getBytes(charset));
                this.outputStream.write(System.lineSeparator().getBytes(charset));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
            this.outputStream.close();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset keyset) throws IOException {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                String jSONObject = toJson(keyset).toString(4);
                Charset charset = UTF_8;
                outputStream.write(jSONObject.getBytes(charset));
                this.outputStream.write(System.lineSeparator().getBytes(charset));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
            this.outputStream.close();
        }
    }

    private JSONObject toJson(Keyset keyset) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("primaryKeyId", toUnsignedLong(keyset.getPrimaryKeyId()));
        JSONArray jSONArray = new JSONArray();
        for (Keyset.Key key : keyset.getKeyList()) {
            jSONArray.put(toJson(key));
        }
        jSONObject.put("key", jSONArray);
        return jSONObject;
    }

    private JSONObject toJson(Keyset.Key key) throws JSONException {
        return new JSONObject().put("keyData", toJson(key.getKeyData())).put("status", key.getStatus().name()).put("keyId", toUnsignedLong(key.getKeyId())).put("outputPrefixType", key.getOutputPrefixType().name());
    }

    private JSONObject toJson(KeyData keyData) throws JSONException {
        return new JSONObject().put("typeUrl", keyData.getTypeUrl()).put("value", Base64.encode(keyData.getValue().toByteArray())).put("keyMaterialType", keyData.getKeyMaterialType().name());
    }

    private JSONObject toJson(EncryptedKeyset keyset) throws JSONException {
        return new JSONObject().put("encryptedKeyset", Base64.encode(keyset.getEncryptedKeyset().toByteArray())).put("keysetInfo", toJson(keyset.getKeysetInfo()));
    }

    private JSONObject toJson(KeysetInfo keysetInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("primaryKeyId", toUnsignedLong(keysetInfo.getPrimaryKeyId()));
        JSONArray jSONArray = new JSONArray();
        for (KeysetInfo.KeyInfo keyInfo : keysetInfo.getKeyInfoList()) {
            jSONArray.put(toJson(keyInfo));
        }
        jSONObject.put("keyInfo", jSONArray);
        return jSONObject;
    }

    private JSONObject toJson(KeysetInfo.KeyInfo keyInfo) throws JSONException {
        return new JSONObject().put("typeUrl", keyInfo.getTypeUrl()).put("status", keyInfo.getStatus().name()).put("keyId", keyInfo.getKeyId()).put("outputPrefixType", keyInfo.getOutputPrefixType().name());
    }
}
