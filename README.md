# Realitech - Augmented Reality (AR) and Virtual Reality (VR) Microservice App


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Realitech is an Augmented Reality (AR) and Virtual Reality (VR) microservice app that allows developers to integrate AR and VR functionalities into their applications easily. It provides a set of microservices that enable developers to create immersive and interactive experiences using AR and VR technologies.

## Features

- AR and VR Content Rendering: Realitech offers powerful rendering capabilities for both Augmented Reality and Virtual Reality content.
- Marker-Based AR: Easily integrate marker-based AR experiences into your applications.
- 3D Object Recognition: Realitech supports 3D object recognition, allowing you to trigger AR content based on real-world objects.
- Interactive VR Environment: Create interactive and engaging Virtual Reality environments using Realitech's tools.
- Multi-platform Support: Realitech is designed to work across various platforms, including Android, iOS, and web browsers.
- Scalable Architecture: The microservice architecture ensures scalability and flexibility to handle large-scale AR and VR applications.

## Installation

To install and use Realitech, follow these steps:

1. Clone the repository: `git clone https://github.com/realitech-app/realitech.git`
2. Install dependencies: `npm install`
3. Configure the environment variables: Copy `.env.example` to `.env` and set the necessary configuration parameters.
4. Start the microservices: `npm start`

## Usage

Realitech provides a RESTful API for communication with the microservices. Here's a basic example of how to use Realitech in your application:

```javascript
import axios from 'axios';

const baseURL = 'https://api.realitech.com';

// Example API call to render AR content
async function renderARContent(contentURL, markerID) {
  try {
    const response = await axios.post(`${baseURL}/ar/render`, {
      contentURL,
      markerID,
    });
    return response.data;
  } catch (error) {
    console.error('Error rendering AR content:', error);
    throw error;
  }
}
```

For more detailed usage instructions and API endpoints, please refer to the [API Documentation](#api-documentation).

## API Documentation

For detailed information on the available API endpoints and their usage, please refer to the [API documentation](https://api.realitech.com/docs).

## Contributing

We welcome contributions from the community! To contribute to Realitech, follow these steps:

1. Fork the repository.
2. Create a new branch for your feature: `git checkout -b feature-name`
3. Commit your changes: `git commit -m "Add feature"`
4. Push to the branch: `git push origin feature-name`
5. Submit a pull request.

Please ensure that you've read and adhered to our [Code of Conduct](https://realitech.com/code-of-conduct) before contributing.

## License

Realitech is open-source software licensed under the [MIT License](https://opensource.org/licenses/MIT).


## Deployment

Realitech can be deployed on a cloud service or on-premises server. We recommend using a cloud-based solution like AWS, Google Cloud, or Azure for easy scalability and maintenance. You can deploy the microservices using containerization technologies like Docker and Kubernetes for efficient management.

Before deploying to a production environment, ensure that you have configured the necessary environment variables with appropriate values, such as API keys, database connection strings, and other sensitive information.

## Testing

Realitech includes a comprehensive test suite to ensure the reliability and functionality of the microservices. To run the tests, use the following command:

```bash
npm test
```

We encourage contributors to write tests for new features and bug fixes to maintain code quality.

## Security

Security is of utmost importance to us at Realitech. However, since this app deals with AR and VR content rendering, it's essential to validate user input and ensure proper authentication and authorization mechanisms are in place. Always keep your dependencies up-to-date to mitigate potential security vulnerabilities.

Please report any security concerns you discover to our security team at security@realitech.com. We appreciate responsible disclosure and will address any reported issues promptly.

## Support and Community

For any questions, feedback, or suggestions, join our community on our [Discord server](https://discord.com/realitech) or visit our [website](https://realitech.com) for additional resources and documentation.

You can also submit bug reports or feature requests through our [GitHub repository](https://github.com/realitech-app/realitech/issues). We highly value your input, and our team actively monitors the repository.

## Acknowledgments

We would like to express our gratitude to the open-source community for their invaluable contributions and inspiring projects that have helped shape Realitech.

## About Realitech

Realitech was founded in 20XX with a mission to make Augmented Reality and Virtual Reality accessible to developers and businesses worldwide. Our team is passionate about pushing the boundaries of immersive technology and enabling innovative experiences for users.

Connect with us:

- Website: [https://realitech.com](https://realitech.com)
- Twitter: [@RealitechHQ](https://twitter.com/RealitechHQ)
- LinkedIn: [Realitech](https://www.linkedin.com/company/realitech)

## License

Realitech is open-source software licensed under the [MIT License](https://opensource.org/licenses/MIT).


## System Requirements

Before running Realitech, ensure that your system meets the following minimum requirements:

- Node.js version 14 or higher
- Docker (if deploying using containers)
- Internet connection to access external services and APIs
- Modern web browser with support for AR and VR (for testing and development)

## Getting Started

To quickly get started with Realitech, you can follow these steps:

1. Install Node.js: Download and install Node.js from the official website [https://nodejs.org](https://nodejs.org).

2. Clone the repository: Use Git to clone the Realitech repository to your local machine:

   ```bash
   git clone https://github.com/realitech-app/realitech.git
   ```

3. Navigate to the project folder: Change into the Realitech project directory:

   ```bash
   cd realitech
   ```

4. Install dependencies: Use npm to install all required dependencies:

   ```bash
   npm install
   ```

5. Set up environment variables: Create a `.env` file in the project root and configure necessary environment variables. You can use the `.env.example` file as a template.

6. Start the development server: Launch the Realitech app locally for testing and development:

   ```bash
   npm start
   ```

7. Access the app: Open your web browser and go to `http://localhost:3000` to access the Realitech app.

## Folder Structure

The Realitech project follows a structured organization to keep code modular and maintainable. Here's an overview of the main folders and their purposes:

```
realitech/
├── api/                # API controllers and routes
├── config/             # Configuration files and settings
├── models/             # Database models and schemas
├── public/             # Public assets (e.g., images, fonts, etc.)
├── services/           # AR and VR microservices
├── tests/              # Test files
├── utils/              # Utility functions and helpers
├── views/              # Frontend views (if using server-side rendering)
├── .env                # Environment variables configuration
├── .gitignore          # List of files and folders to ignore in version control
├── package.json        # Project dependencies and scripts
├── server.js           # Entry point for the application
├── README.md           # Project documentation (this file)
```

## Frequently Asked Questions (FAQ)

Here are some common questions and answers about Realitech:

Q: Is Realitech compatible with mobile devices?
A: Yes, Realitech is designed to work on both mobile devices (iOS and Android) and desktop web browsers.

Q: Can I contribute to Realitech even if I'm not an expert in AR/VR?
A: Absolutely! We welcome contributors from all backgrounds, and you can contribute in various ways, including documentation, testing, and frontend/backend development.

Q: How can I report bugs or request new features?
A: You can submit bug reports or feature requests through our GitHub Issues page [here](https://github.com/realitech-app/realitech/issues).

Q: Is Realitech free to use for commercial projects?
A: Yes, Realitech is licensed under the MIT License, which allows you to use it freely for both personal and commercial projects.

---

Feel free to customize the content further to provide more specific information about your app's features, technologies used, and any other relevant details. If you have any other specific questions or need assistance with anything else, let me know! I'm here to help. Good luck with your Realitech project!

## Project Structure

Node is required for generation and recommended for development. `package.json` is always generated for a better development experience with prettier, commit hooks, scripts and so on.

In the project root, JHipster generates configuration files for tools like git, prettier, eslint, husky, and others that are well known and you can find references in the web.

`/src/*` structure follows default Java structure.

- `.yo-rc.json` - Yeoman configuration file
  JHipster configuration is stored in this file at `generator-jhipster` key. You may find `generator-jhipster-*` for specific blueprints configuration.
- `.yo-resolve` (optional) - Yeoman conflict resolver
  Allows to use a specific action when conflicts are found skipping prompts for files that matches a pattern. Each line should match `[pattern] [action]` with pattern been a [Minimatch](https://github.com/isaacs/minimatch#minimatch) pattern and action been one of skip (default if ommited) or force. Lines starting with `#` are considered comments and are ignored.
- `.jhipster/*.json` - JHipster entity configuration files

- `npmw` - wrapper to use locally installed npm.
  JHipster installs Node and npm locally using the build tool by default. This wrapper makes sure npm is installed locally and uses it avoiding some differences different versions can cause. By using `./npmw` instead of the traditional `npm` you can configure a Node-less environment to develop or test your application.
- `/src/main/docker` - Docker configurations for the application and services that the application depends on

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Node.js][]: We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```
npm install
```

We use npm scripts and [Angular CLI][] with [Webpack][] as our build system.

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

```
./gradlew -x webapp
npm start
```

Npm is also used to manage CSS and JavaScript dependencies used in this application. You can upgrade dependencies by
specifying a newer version in [package.json](package.json). You can also run `npm update` and `npm install` to manage dependencies.
Add the `help` flag on any command to see how you can use it. For example, `npm help update`.

The `npm run` command will list all of the scripts available to run for this project.

### PWA Support

JHipster ships with PWA (Progressive Web App) support, and it's turned off by default. One of the main components of a PWA is a service worker.

The service worker initialization code is disabled by default. To enable it, uncomment the following code in `src/main/webapp/app/app.module.ts`:

```typescript
ServiceWorkerModule.register('ngsw-worker.js', { enabled: false }),
```

### Managing dependencies

For example, to add [Leaflet][] library as a runtime dependency of your application, you would run following command:

```
npm install --save --save-exact leaflet
```

To benefit from TypeScript type definitions from [DefinitelyTyped][] repository in development, you would run following command:

```
npm install --save-dev --save-exact @types/leaflet
```

Then you would import the JS and CSS files specified in library's installation instructions so that [Webpack][] knows about them:
Edit [src/main/webapp/app/app.module.ts](src/main/webapp/app/app.module.ts) file:

```
import 'leaflet/dist/leaflet.js';
```

Edit [src/main/webapp/content/scss/vendor.scss](src/main/webapp/content/scss/vendor.scss) file:

```
@import 'leaflet/dist/leaflet.css';
```

Note: There are still a few other things remaining to do for Leaflet that we won't detail here.

For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].

### Developing Microfrontend

Microservices doesn't contain every required backend feature to allow microfrontends to run alone.
You must start a pre-built gateway version or from source.

Start gateway from source:

```
cd gateway
npm run docker:db:up # start database if necessary
npm run docker:others:up # start service discovery and authentication service if necessary
npm run app:start # alias for ./(mvnw|gradlew)
```

Microfrontend's `build-watch` script is configured to watch and compile microfrontend's sources and synchronizes with gateway's frontend.
Start it using:

```
cd microfrontend
npm run docker:db:up # start database if necessary
npm run build-watch
```

It's possible to run microfrontend's frontend standalone using:

```
cd microfrontend
npm run docker:db:up # start database if necessary
npm watch # alias for `npm start` and `npm run backend:start` in parallel
```

### Using Angular CLI

You can also use [Angular CLI][] to generate some custom client code.

For example, the following command:

```
ng generate component my-component
```

will generate few files:

```
create src/main/webapp/app/my-component/my-component.component.html
create src/main/webapp/app/my-component/my-component.component.ts
update src/main/webapp/app/app.module.ts
```

### JHipster Control Center

JHipster Control Center can help you manage and control your application(s). You can start a local control center server (accessible on http://localhost:7419) with:

```
docker compose -f src/main/docker/jhipster-control-center.yml up
```

### OAuth 2.0 / OpenID Connect

Congratulations! You've selected an excellent way to secure your JHipster application. If you're not sure what OAuth and OpenID Connect (OIDC) are, please see [What the Heck is OAuth?](https://developer.okta.com/blog/2017/06/21/what-the-heck-is-oauth)

To log in to your app, you'll need to have [Keycloak](https://keycloak.org) up and running. The JHipster Team has created a Docker container for you that has the default users and roles. Start Keycloak using the following command.

```
docker compose -f src/main/docker/keycloak.yml up
```

The security settings in `src/main/resources/config/application.yml` are configured for this image.

```yaml
spring:
  ...
  security:
    oauth2:
      client:
        provider:
          oidc:
            issuer-uri: http://localhost:9080/realms/jhipster
        registration:
          oidc:
            client-id: web_app
            client-secret: web_app
            scope: openid,profile,email
```

Some of Keycloak configuration is now done in build time and the other part before running the app, here is the [list](https://www.keycloak.org/server/all-config) of all build and configuration options.

Before moving to production, please make sure to follow this [guide](https://www.keycloak.org/server/configuration) for better security and performance.

Also, you should never use `start-dev` nor `KC_DB=dev-file` in production.

When using Kubernetes, importing should be done using init-containers (with a volume when using `db=dev-file`).

### Okta

If you'd like to use Okta instead of Keycloak, it's pretty quick using the [Okta CLI](https://cli.okta.com/). After you've installed it, run:

```shell
okta register
```

Then, in your JHipster app's directory, run `okta apps create` and select **JHipster**. This will set up an Okta app for you, create `ROLE_ADMIN` and `ROLE_USER` groups, create a `.okta.env` file with your Okta settings, and configure a `groups` claim in your ID token.

Run `source .okta.env` and start your app with Maven or Gradle. You should be able to sign in with the credentials you registered with.

If you're on Windows, you should install [WSL](https://docs.microsoft.com/en-us/windows/wsl/install-win10) so the `source` command will work.

If you'd like to configure things manually through the Okta developer console, see the instructions below.

First, you'll need to create a free developer account at <https://developer.okta.com/signup/>. After doing so, you'll get your own Okta domain, that has a name like `https://dev-123456.okta.com`.

Modify `src/main/resources/config/application.yml` to use your Okta settings.

```yaml
spring:
  ...
  security:
    oauth2:
      client:
        provider:
          oidc:
            issuer-uri: https://{yourOktaDomain}/oauth2/default
        registration:
          oidc:
            client-id: {clientId}
            client-secret: {clientSecret}
security:
```

Create an OIDC App in Okta to get a `{clientId}` and `{clientSecret}`. To do this, log in to your Okta Developer account and navigate to **Applications** > **Add Application**. Click **Web** and click the **Next** button. Give the app a name you’ll remember, specify `http://localhost:8080` as a Base URI, and `http://localhost:8080/login/oauth2/code/oidc` as a Login Redirect URI. Click **Done**, then Edit and add `http://localhost:8080` as a Logout redirect URI. Copy and paste the client ID and secret into your `application.yml` file.

Create a `ROLE_ADMIN` and `ROLE_USER` group and add users into them. Modify e2e tests to use this account when running integration tests. You'll need to change credentials in `src/test/javascript/e2e/account/account.spec.ts` and `src/test/javascript/e2e/admin/administration.spec.ts`.

Navigate to **API** > **Authorization Servers**, click the **Authorization Servers** tab and edit the default one. Click the **Claims** tab and **Add Claim**. Name it "groups", and include it in the ID Token. Set the value type to "Groups" and set the filter to be a Regex of `.*`.

After making these changes, you should be good to go! If you have any issues, please post them to [Stack Overflow](https://stackoverflow.com/questions/tagged/jhipster). Make sure to tag your question with "jhipster" and "okta".

### Auth0

If you'd like to use [Auth0](https://auth0.com/) instead of Keycloak, follow the configuration steps below:

- Create a free developer account at <https://auth0.com/signup>. After successful sign-up, your account will be associated with a unique domain like `dev-xxx.us.auth0.com`
- Create a new application of type `Regular Web Applications`. Switch to the `Settings` tab, and configure your application settings like:
  - Allowed Callback URLs: `http://localhost:8080/login/oauth2/code/oidc`
  - Allowed Logout URLs: `http://localhost:8080/`
- Navigate to **User Management** > **Roles** and create new roles named `ROLE_ADMIN`, and `ROLE_USER`.
- Navigate to **User Management** > **Users** and create a new user account. Click on the **Role** tab to assign roles to the newly created user account.
- Navigate to **Auth Pipeline** > **Rules** and create a new Rule. Choose `Empty rule` template. Provide a meaningful name like `JHipster claims` and replace `Script` content with the following and Save.

```javascript
function (user, context, callback) {
  user.preferred_username = user.email;
  const roles = (context.authorization || {}).roles;

  function prepareCustomClaimKey(claim) {
    return `https://www.jhipster.tech/${claim}`;
  }

  const rolesClaim = prepareCustomClaimKey('roles');

  if (context.idToken) {
    context.idToken[rolesClaim] = roles;
  }

  if (context.accessToken) {
    context.accessToken[rolesClaim] = roles;
  }

  callback(null, user, context);
}
```

- In your `JHipster` application, modify `src/main/resources/config/application.yml` to use your Auth0 application settings:

```yaml
spring:
  ...
  security:
    oauth2:
      client:
        provider:
          oidc:
            # make sure to include the ending slash!
            issuer-uri: https://{your-auth0-domain}/
        registration:
          oidc:
            client-id: {clientId}
            client-secret: {clientSecret}
            scope: openid,profile,email
jhipster:
  ...
  security:
    oauth2:
      audience:
        - https://{your-auth0-domain}/api/v2/
```

### Doing API-First development using openapi-generator-cli

[OpenAPI-Generator]() is configured for this application. You can generate API code from the `src/main/resources/swagger/api.yml` definition file by running:

```bash
./gradlew openApiGenerate
```

Then implements the generated delegate classes with `@Service` classes.

To edit the `api.yml` definition file, you can use a tool such as [Swagger-Editor](). Start a local instance of the swagger-editor using docker by running: `docker compose -f src/main/docker/swagger-editor.yml up -d`. The editor will then be reachable at [http://localhost:7742](http://localhost:7742).

Refer to [Doing API-First development][] for more details.

## Building for production

### Packaging as jar

To build the final jar and optimize the Realitech application for production, run:

```
./gradlew -Pprod clean bootJar
```

This will concatenate and minify the client CSS and JavaScript files. It will also modify `index.html` so it references these new files.
To ensure everything worked, run:

```
java -jar build/libs/*.jar
```

Then navigate to [http://localhost:8081](http://localhost:8081) in your browser.

Refer to [Using JHipster in production][] for more details.

### Packaging as war

To package your application as a war in order to deploy it to an application server, run:

```
./gradlew -Pprod -Pwar clean bootWar
```

## Testing

To launch your application's tests, run:

```
./gradlew test integrationTest jacocoTestReport
```

### Client tests

Unit tests are run by [Jest][]. They're located in [src/test/javascript/](src/test/javascript/) and can be run with:

```
npm test
```

### Other tests

Performance tests are run by [Gatling][] and written in Scala. They're located in [src/test/java/gatling/simulations](src/test/java/gatling/simulations).

You can execute all Gatling tests with

```
./gradlew gatlingRun.
```

For more information, refer to the [Running tests page][].

### Code quality

Sonar is used to analyse code quality. You can start a local Sonar server (accessible on http://localhost:9001) with:

```
docker compose -f src/main/docker/sonar.yml up -d
```

Note: we have turned off forced authentication redirect for UI in [src/main/docker/sonar.yml](src/main/docker/sonar.yml) for out of the box experience while trying out SonarQube, for real use cases turn it back on.

You can run a Sonar analysis with using the [sonar-scanner](https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) or by using the gradle plugin.

Then, run a Sonar analysis:

```
./gradlew -Pprod clean check jacocoTestReport sonarqube -Dsonar.login=admin -Dsonar.password=admin
```

Additionally, Instead of passing `sonar.password` and `sonar.login` as CLI arguments, these parameters can be configured from [sonar-project.properties](sonar-project.properties) as shown below:

```
sonar.login=admin
sonar.password=admin
```

For more information, refer to the [Code quality page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a postgresql database in a docker container, run:

```
docker compose -f src/main/docker/postgresql.yml up -d
```

To stop it and remove the container, run:

```
docker compose -f src/main/docker/postgresql.yml down
```

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

```
npm run java:docker
```

Or build a arm64 docker image when using an arm64 processor os like MacOS with M1 processor family running:

```
npm run java:docker:arm64
```

Then run:

```
docker compose -f src/main/docker/app.yml up -d
```

When running Docker Desktop on MacOS Big Sur or later, consider enabling experimental `Use the new Virtualization framework` for better processing performance ([disk access performance is worse](https://github.com/docker/roadmap/issues/7)).

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JHipster Homepage and latest documentation]: https://www.jhipster.tech
[JHipster 8.0.0-beta.2 archive]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2
[Doing microservices with JHipster]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/microservices-architecture/
[Using JHipster in development]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/development/
[Service Discovery and Configuration with the JHipster-Registry]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/microservices-architecture/#jhipster-registry
[Using Docker and Docker-Compose]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/docker-compose
[Using JHipster in production]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/production/
[Running tests page]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/running-tests/
[Code quality page]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/code-quality/
[Setting up Continuous Integration]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/setting-up-ci/
[Node.js]: https://nodejs.org/
[NPM]: https://www.npmjs.com/
[Webpack]: https://webpack.github.io/
[BrowserSync]: https://www.browsersync.io/
[Jest]: https://facebook.github.io/jest/
[Leaflet]: https://leafletjs.com/
[DefinitelyTyped]: https://definitelytyped.org/
[Angular CLI]: https://cli.angular.io/
[Gatling]: https://gatling.io/
[OpenAPI-Generator]: https://openapi-generator.tech
[Swagger-Editor]: https://editor.swagger.io
[Doing API-First development]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/doing-api-first-development/
