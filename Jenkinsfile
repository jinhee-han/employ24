node {
    	stage('Clone repository') {
		checkout scm
    	}
	stage('Build image') {
		sh """
			#!/bin/bash
			ls
			chmod +x gradlew
			./gradlew build
			docker build -t employ .
		"""
	}
	stage('Push image') {
		sh """
			#!/bin/bash

			docker image tag employ localhost:8888/employ
			docker push localhost:8888/employ
		"""
	}
	stage('Remove image') {
		sh """
			#!/bin/bash


			docker rm -f employ
			docker system prune -af
		"""
	}
	stage('Run image') {
		sh """
			#!/bin/bash

			docker run --name employ -p 8888:8080 -d localhost:8888/employ
		"""
	}
}