package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public final class JsonKeysetReader implements KeysetReader {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final boolean closeStreamAfterReading;
    private final InputStream inputStream;
    private final JSONObject json;
    private boolean urlSafeBase64;

    private JsonKeysetReader(InputStream inputStream, boolean closeStreamAfterReading) {
        this.urlSafeBase64 = false;
        this.inputStream = inputStream;
        this.closeStreamAfterReading = closeStreamAfterReading;
        this.json = null;
    }

    private JsonKeysetReader(JSONObject json) {
        this.urlSafeBase64 = false;
        this.json = json;
        this.inputStream = null;
        this.closeStreamAfterReading = false;
    }

    public static KeysetReader withInputStream(InputStream input) throws IOException {
        return new JsonKeysetReader(input, false);
    }

    public static JsonKeysetReader withJsonObject(JSONObject input) {
        return new JsonKeysetReader(input);
    }

    public static JsonKeysetReader withString(String input) {
        return new JsonKeysetReader(new ByteArrayInputStream(input.getBytes(UTF_8)), true);
    }

    public static JsonKeysetReader withBytes(final byte[] bytes) {
        return new JsonKeysetReader(new ByteArrayInputStream(bytes), true);
    }

    public static JsonKeysetReader withFile(File file) throws IOException {
        return new JsonKeysetReader(new FileInputStream(file), true);
    }

    public static JsonKeysetReader withPath(String path) throws IOException {
        return withFile(new File(path));
    }

    public static JsonKeysetReader withPath(Path path) throws IOException {
        File file;
        file = path.toFile();
        return withFile(file);
    }

    public JsonKeysetReader withUrlSafeBase64() {
        this.urlSafeBase64 = true;
        return this;
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        try {
            try {
                JSONObject jSONObject = this.json;
                if (jSONObject != null) {
                    return keysetFromJson(jSONObject);
                }
                Keyset keysetFromJson = keysetFromJson(new JSONObject(new String(Util.readAll(this.inputStream), UTF_8)));
                InputStream inputStream = this.inputStream;
                if (inputStream != null && this.closeStreamAfterReading) {
                    inputStream.close();
                }
                return keysetFromJson;
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
            InputStream inputStream2 = this.inputStream;
            if (inputStream2 != null && this.closeStreamAfterReading) {
                inputStream2.close();
            }
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        try {
            try {
                JSONObject jSONObject = this.json;
                if (jSONObject != null) {
                    return encryptedKeysetFromJson(jSONObject);
                }
                EncryptedKeyset encryptedKeysetFromJson = encryptedKeysetFromJson(new JSONObject(new String(Util.readAll(this.inputStream), UTF_8)));
                InputStream inputStream = this.inputStream;
                if (inputStream != null && this.closeStreamAfterReading) {
                    inputStream.close();
                }
                return encryptedKeysetFromJson;
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } finally {
            InputStream inputStream2 = this.inputStream;
            if (inputStream2 != null && this.closeStreamAfterReading) {
                inputStream2.close();
            }
        }
    }

    private Keyset keysetFromJson(JSONObject json) throws JSONException {
        validateKeyset(json);
        Keyset.Builder newBuilder = Keyset.newBuilder();
        if (json.has("primaryKeyId")) {
            newBuilder.setPrimaryKeyId(json.getInt("primaryKeyId"));
        }
        JSONArray jSONArray = json.getJSONArray("key");
        for (int i = 0; i < jSONArray.length(); i++) {
            newBuilder.addKey(keyFromJson(jSONArray.getJSONObject(i)));
        }
        return newBuilder.build();
    }

    private EncryptedKeyset encryptedKeysetFromJson(JSONObject json) throws JSONException {
        byte[] decode;
        validateEncryptedKeyset(json);
        if (this.urlSafeBase64) {
            decode = Base64.urlSafeDecode(json.getString("encryptedKeyset"));
        } else {
            decode = Base64.decode(json.getString("encryptedKeyset"));
        }
        return EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(decode)).setKeysetInfo(keysetInfoFromJson(json.getJSONObject("keysetInfo"))).build();
    }

    private Keyset.Key keyFromJson(JSONObject json) throws JSONException {
        validateKey(json);
        return Keyset.Key.newBuilder().setStatus(getStatus(json.getString("status"))).setKeyId(json.getInt("keyId")).setOutputPrefixType(getOutputPrefixType(json.getString("outputPrefixType"))).setKeyData(keyDataFromJson(json.getJSONObject("keyData"))).build();
    }

    private static KeysetInfo keysetInfoFromJson(JSONObject json) throws JSONException {
        KeysetInfo.Builder newBuilder = KeysetInfo.newBuilder();
        if (json.has("primaryKeyId")) {
            newBuilder.setPrimaryKeyId(json.getInt("primaryKeyId"));
        }
        if (json.has("keyInfo")) {
            JSONArray jSONArray = json.getJSONArray("keyInfo");
            for (int i = 0; i < jSONArray.length(); i++) {
                newBuilder.addKeyInfo(keyInfoFromJson(jSONArray.getJSONObject(i)));
            }
        }
        return newBuilder.build();
    }

    private static KeysetInfo.KeyInfo keyInfoFromJson(JSONObject json) throws JSONException {
        return KeysetInfo.KeyInfo.newBuilder().setStatus(getStatus(json.getString("status"))).setKeyId(json.getInt("keyId")).setOutputPrefixType(getOutputPrefixType(json.getString("outputPrefixType"))).setTypeUrl(json.getString("typeUrl")).build();
    }

    private KeyData keyDataFromJson(JSONObject json) throws JSONException {
        byte[] decode;
        validateKeyData(json);
        if (this.urlSafeBase64) {
            decode = Base64.urlSafeDecode(json.getString("value"));
        } else {
            decode = Base64.decode(json.getString("value"));
        }
        return KeyData.newBuilder().setTypeUrl(json.getString("typeUrl")).setValue(ByteString.copyFrom(decode)).setKeyMaterialType(getKeyMaterialType(json.getString("keyMaterialType"))).build();
    }

    private static KeyStatusType getStatus(String status) throws JSONException {
        if (status.equals("ENABLED")) {
            return KeyStatusType.ENABLED;
        }
        if (status.equals("DISABLED")) {
            return KeyStatusType.DISABLED;
        }
        throw new JSONException("unknown status: " + status);
    }

    private static OutputPrefixType getOutputPrefixType(String type) throws JSONException {
        if (type.equals("TINK")) {
            return OutputPrefixType.TINK;
        }
        if (type.equals("RAW")) {
            return OutputPrefixType.RAW;
        }
        if (type.equals("LEGACY")) {
            return OutputPrefixType.LEGACY;
        }
        if (type.equals("CRUNCHY")) {
            return OutputPrefixType.CRUNCHY;
        }
        throw new JSONException("unknown output prefix type: " + type);
    }

    private static KeyData.KeyMaterialType getKeyMaterialType(String type) throws JSONException {
        if (type.equals("SYMMETRIC")) {
            return KeyData.KeyMaterialType.SYMMETRIC;
        }
        if (type.equals("ASYMMETRIC_PRIVATE")) {
            return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
        }
        if (type.equals("ASYMMETRIC_PUBLIC")) {
            return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
        }
        if (type.equals("REMOTE")) {
            return KeyData.KeyMaterialType.REMOTE;
        }
        throw new JSONException("unknown key material type: " + type);
    }

    private static void validateKeyset(JSONObject json) throws JSONException {
        if (!json.has("key") || json.getJSONArray("key").length() == 0) {
            throw new JSONException("invalid keyset");
        }
    }

    private static void validateEncryptedKeyset(JSONObject json) throws JSONException {
        if (!json.has("encryptedKeyset")) {
            throw new JSONException("invalid encrypted keyset");
        }
    }

    private static void validateKey(JSONObject json) throws JSONException {
        if (!json.has("keyData") || !json.has("status") || !json.has("keyId") || !json.has("outputPrefixType")) {
            throw new JSONException("invalid key");
        }
    }

    private static void validateKeyData(JSONObject json) throws JSONException {
        if (!json.has("typeUrl") || !json.has("value") || !json.has("keyMaterialType")) {
            throw new JSONException("invalid keyData");
        }
    }
}
