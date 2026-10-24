FROM mcr.microsoft.com/devcontainers/java:1-21-bookworm
RUN rm -f /etc/apt/sources.list.d/yarn.list /etc/apt/sources.list.d/yarnpkg.list && apt-get update && apt-get install -y wget ca-certificates
RUN wget -q -O /tmp/google-chrome-stable_current_amd64.deb https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get install -y /tmp/google-chrome-stable_current_amd64.deb
RUN rm -f /tmp/google-chrome-stable_current_amd64.deb && apt-get clean && rm -rf /var/lib/apt/lists/*
ENV CHROME_BIN=/usr/bin/google-chrome
RUN rm -f /etc/apt/sources.list.d/yarn.list /etc/apt/sources.list.d/yarnpkg.list && apt-get update && apt-get install -y unzip && CHROME_MAJOR=$(google-chrome --version | grep -oE "[0-9]+" | head -1) && DRIVER_VERSION=$(wget -qO- https://googlechromelabs.github.io/chrome-for-testing/LATEST_RELEASE_${CHROME_MAJOR}) && wget -q -O /tmp/chromedriver.zip https://storage.googleapis.com/chrome-for-testing-public/${DRIVER_VERSION}/linux64/chromedriver-linux64.zip && unzip -q /tmp/chromedriver.zip -d /tmp && mv /tmp/chromedriver-linux64/chromedriver /usr/local/bin/chromedriver && chmod +x /usr/local/bin/chromedriver && rm -rf /tmp/chromedriver.zip /tmp/chromedriver-linux64 && apt-get clean && rm -rf /var/lib/apt/lists/*
RUN rm -f /etc/apt/sources.list.d/yarn.list /etc/apt/sources.list.d/yarnpkg.list && apt-get update && apt-get install -y maven && apt-get clean && rm -rf /var/lib/apt/lists/*
