# Project layouts for mono-repo and multi-api maven projects 


## Current situation 

- [x] (pm) `parent`
    - [x] (jm) `app`        -> all is in here (common, apione, apitwo and all tests/IT)
    - [x] (jm) `perf`       -> performance tests (gatling)
    - [x] (f) `companion`
        - [x] (f) `swagger`
        - [x] (f) `dockers`
        - [x] (f) `postman collections`
        - [x] (f) `(wire)mocks`
    - [x] (pm) `conf`
        - maven `assembly` plugin         -> create archives
        - ADO pipeline configuration

## Goals

- [x] Better time to market
- [x] Better separation of concerns
- [x] Improved development experience
   - [x] Better reasoning (feature) logic reasoning
   - [x] Simplified code review
   - [x] Straightforward Merge, cherry pick
   - [x] Reduced scope of Integration Tests
   - [x] A simpler revert to a certain API version
   - [x] Simple investigation (just disable an API and run the reproducible steps)
- [x] Release
    - [x] Some issues in one API could be reverted/or eliminated altogether in case of:
        - [x] last minute PT issues
        - [x] performance issues observed too late

## Proposal 1

- [x] (pm) `parent`
    - [x] (jm) `bootstrapper`
    - [x] (jm) `common`
    - [x] (jm) `apione`
    - [x] (jm) `apitwo`
    - [x] (jm) `perf`       - performance tests (gatling)
    - [x] (jm) `e2e`        - e2e tests (cucumber)
    - [x] (f) `companion`
        - [x] (f) `swagger`
        - [x] (f) `dockers`
        - [x] (f) `postman collections`
        - [x] (f) `(wire)mocks`
    - [x] (pm) `conf`
        - maven assembly plugin -> create archives
        - ADO pipeline configuration

## Proposal 2

- [x] (pm) `parent`
    - [x] (jm) `bootstrapper` - contains the springboot application entrypoint (bootstrap)
    - [x] (jm) `common`
    - [x] (pm) `apitwo`
        - [x] (jm) `app`
        - [x] (jm) `perf`
        - [x] (jm) `e2`
    - [x] (pm) `apione`
        - [x] (jm) `app`
        - [x] (jm) `perf`
        - [x] (jm) `e2e`
    - [x] (f) `companion`
        - [x] (f) `swagger`
        - [x] (f) `dockers`
        - [x] (f) `postman collections`
        - [x] (f) `(wire)mocks`
    - [x] (m) `conf`
        - maven assembly plugin -> create archives
        - ADO pipeline configuration
             
# Legend: 
- (pm)      -> pom maven module
- (jm)      -> jar module
- (f)       -> folder
