package com.rallydev.intellij.wsapi.domain

import com.rallydev.intellij.wsapi.ApiEndpoint

class Workspace extends DomainObject {

    String name

    @Override
    ApiEndpoint getApiEndpoint() {
        return ApiEndpoint.WORKSPACE
    }

}
