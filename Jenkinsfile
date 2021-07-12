node {
    	stage('Clone repository') {
		checkout scm
    	}
	stage('Build image') {
		sh """
			#!/bin/bash
			# Construct Image Name
			IMAGE=employ

			docker build \
			-t \${IMAGE} \

		"""
	}
	stage('Push image') {
		sh """
			#!/bin/bash


			docker push employ
		"""
	}
	stage('Remove image') {
		sh """
			#!/bin/bash

			docker rm -f employ

		"""
	}
	stage('Run image') {
		sh """
			#!/bin/bash

			docker run --name employ -p 8888:8080 -d employ
		"""
	}
}