/*
 * Copyright 2016 Kukri Máté
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package openmcauth.json;

import java.util.UUID;
import openmcauth.storage.MinecraftProfile;

public class AuthResponse {
    private final UUID accessToken;
    private final UUID clientToken;
    private final MinecraftProfile selectedProfile;
    private final MinecraftProfile[] availableProfiles;
    
    public AuthResponse(UUID accessToken, UUID clientToken, MinecraftProfile selectedProfile, MinecraftProfile[] availableProfiles) {
        this.accessToken = accessToken;
        this.clientToken = clientToken;
        this.selectedProfile = selectedProfile;
        this.availableProfiles = availableProfiles;
    }

    public UUID getAccessToken() {
        return accessToken;
    }

    public UUID getClientToken() {
        return clientToken;
    }

    public MinecraftProfile getSelectedProfile() {
        return selectedProfile;
    }

    public MinecraftProfile[] getAvailableProfiles() {
        return availableProfiles;
    }
}
