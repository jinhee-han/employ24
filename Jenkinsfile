node {
    	stage('Clone repository') {
		checkout scm
    	}
	stage('Build image') {
		sh """
			#!/bin/bash
			ls
			docker build -t employ24 .
		"""
	}
	stage('Push image') {
		sh """
			#!/bin/bash

			docker image tag employ24 localhost:8888/employ24
			docker push localhost:8888/employ24
		"""
	}
	stage('Remove image') {
		sh """
			#!/bin/bash


			docker rm -f employ24
			docker system prune -af
		"""
	}
	stage('Run image') {
		sh """
			#!/bin/bash

			docker run --name web -p 8888:8080 -d localhost:8888/employ24
		"""
	}
}