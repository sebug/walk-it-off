# Walk it off - suggesting little walks with public transport connection
Trying to do it in Scala just for fun and games.

So first, install scala (to be included in the dev container at some point):

    curl -fL https://github.com/coursier/coursier/releases/latest/download/cs-x86_64-pc-linux.gz | gzip -d > cs && chmod +x cs && ./cs setup

Then to start using you'll have to source the .profile:

    source ~/.profile

We will be using the [Cask micro-framework](https://com-lihaoyi.github.io/cask/)

Here's how I got started (no need to perform these commands since the sources are checked in):

    curl -LO https://github.com/lihaoyi/cask/releases/download/0.9.1/minimalApplication-0.9.1.zip
    unzip minimalApplication-0.9.1.zip
    mv minimalApplication-0.9.1/* .
    rmdir minimalApplication-0.9.1
    rm minimalApplication-0.9.1.zip
